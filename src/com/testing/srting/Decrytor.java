package com.testing.srting;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class Decrytor {
	
	 static String INITIALIZATIO_VECTOR = "AODVNUASDNVVAOVF";
	   
	  public static String encrypt(String plainText, String encryptionKey) throws Exception {
	    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
	    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
	    cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(INITIALIZATIO_VECTOR.getBytes("UTF-8")));
	    	byte[] eValue=    		cipher.doFinal(plainText.getBytes("UTF-8"));
	    	String ecryptedValue = new BASE64Encoder().encode(eValue);
	    	    		return  ecryptedValue;
	  }
	  
	  public static String decrypt(String plainText, String encryptionKey) throws Exception{
		  
		  byte[] decordedvalue= new BASE64Decoder().decodeBuffer(plainText);
	    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
	    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
	    cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(INITIALIZATIO_VECTOR.getBytes("UTF-8")));
	    return new String(cipher.doFinal(decordedvalue),"UTF-8");
	  }
	
	/*
	 * String ALGO= "ASE"; private byte[] keyValues;
	 * 
	 * public Decrytor(String key) throws UnsupportedEncodingException {
	 * this.keyValues = key.getBytes("UTF-8"); }
	 * 
	 * public String encrypt(String data) throws Exception {
	 * 
	 * Key key= generateKey(); Cipher c= Cipher.getInstance("AES/CBC/NoPadding",
	 * "SunJCE"); c.init(Cipher.ENCRYPT_MODE, key); byte [] eValue=
	 * c.doFinal(data.getBytes()); String ecryptedValue = new
	 * BASE64Encoder().encode(eValue); System.out.println(ecryptedValue); return
	 * ecryptedValue;
	 * 
	 * } public String decrypt(String ecrypteddata) throws Exception { Key key=
	 * generateKey(); Cipher c= Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
	 * c.init(Cipher.DECRYPT_MODE, key); byte[] decordedvalue= new
	 * BASE64Decoder().decodeBuffer(ecrypteddata); byte [] deValue=
	 * c.doFinal(decordedvalue); String decryptedValue = new String(deValue);
	 * System.out.println(decryptedValue); return decryptedValue;
	 * 
	 * }
	 * 
	 * private Key generateKey() { Key key = new SecretKeySpec(keyValues, "AES");
	 * return key; }
	 */

public static void main(String[] args) throws Exception {
	
	try {
	String PLAIN_TEXT = "Java Code Geeks Rock!\0\0\0\0\0\0\0\0\0\0\0";
    String ENCRYPTION_KEY = "0123456789abcdef";

 
            System.out.println("Plain text:" + PLAIN_TEXT);
 
            String cipherText = Decrytor.encrypt(PLAIN_TEXT, ENCRYPTION_KEY);
 
            System.out.println( cipherText);
			/*
			 * for (int i=0; i<cipherText.length; i++) System.out.print(
			 * String.format("%02X ",cipherText[i]));
			 * 
			 * System.out.println("");
			 */
 
            String decrypted = Decrytor.decrypt(cipherText, ENCRYPTION_KEY);
 
            System.out.println("Decrypted Text: " + decrypted);
 
        } catch (Exception e) {
            e.printStackTrace();
        } 
 
}
}
