package com.fang.openapi.util;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;

/**
 * @program: openapi-java-sdk
 * @description: 加密帮助类
 * @author: Songle
 * @create: 2018-07-18 17:53
 **/
public class SecretHelper {
    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static String desEncode(String org, String key) throws
            NoSuchPaddingException,
            NoSuchAlgorithmException,
            InvalidKeyException,
            UnsupportedEncodingException, InvalidKeySpecException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException
    {
        String keyorg = (key + "00000000").substring(0, 8);

        DESKeySpec desKeySpec = new DESKeySpec(keyorg.getBytes("utf8"));
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        SecretKey key2 = factory.generateSecret(desKeySpec);
        IvParameterSpec iv = new IvParameterSpec(keyorg.getBytes("utf8"));

        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS7Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key2,iv);
        byte[] result = cipher.doFinal(org.getBytes("utf8"));
        return Base64.toBase64String(result);
    }

    public static String Md5(String org) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] digest = md5.digest(org.getBytes("utf-8"));
        return Hex.toHexString(digest);
    }
}