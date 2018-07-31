package com.fang.openapi.http.common;

import com.fang.openapi.http.exception.HttpProcessException;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

//import org.apache.http.nio.conn.ssl.SSLIOSessionStrategy;

public class SSLs {

    private static final SSLHandler simpleVerifier = new SSLHandler();
    private static SSLSocketFactory sslFactory;
    private static SSLConnectionSocketFactory sslConnFactory;
//    private static SSLIOSessionStrategy sslIOSessionStrategy;
    private static SSLs sslutil = new SSLs();
    private SSLContext sc;

    public static SSLs getInstance() {
        return sslutil;
    }

    public static SSLs custom() {
        return new SSLs();
    }

    // 重写X509TrustManager类的三个方法,信任服务器证书
    private static class SSLHandler implements X509TrustManager, HostnameVerifier {

        @Override
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return new java.security.cert.X509Certificate[]{};
            //return null;
        }

        @Override
        public void checkServerTrusted(java.security.cert.X509Certificate[] chain,
                                       String authType) throws CertificateException {
        }

        @Override
        public void checkClientTrusted(java.security.cert.X509Certificate[] chain,
                                       String authType) throws CertificateException {
        }

        @Override
        public boolean verify(String paramString, SSLSession paramSSLSession) {
            return true;
        }
    }

    ;

    // 信任主机
    public static HostnameVerifier getVerifier() {
        return simpleVerifier;
    }

    public synchronized SSLSocketFactory getSSLSF() throws HttpProcessException {
        if (sslFactory != null)
            return sslFactory;
        try {
            SSLContext sc = getSSLContext();
            sc.init(null, new TrustManager[]{simpleVerifier}, null);
            sslFactory = sc.getSocketFactory();
        } catch (KeyManagementException e) {
            throw new HttpProcessException(e);
        }
        return sslFactory;
    }

    public synchronized SSLConnectionSocketFactory getSSLCONNSF() throws HttpProcessException {
        if (sslConnFactory != null)
            return sslConnFactory;
        try {
            SSLContext sc = getSSLContext();
//	    	sc.init(null, new TrustManager[] { simpleVerifier }, null);
            sc.init(null, new TrustManager[]{simpleVerifier}, new java.security.SecureRandom());
            sslConnFactory = new SSLConnectionSocketFactory(sc, simpleVerifier);
        } catch (KeyManagementException e) {
            throw new HttpProcessException(e);
        }
        return sslConnFactory;
    }

//    public synchronized SSLIOSessionStrategy getSSLIOSS() throws HttpProcessException {
//        if (sslIOSessionStrategy != null)
//            return sslIOSessionStrategy;
//        try {
//            SSLContext sc = getSSLContext();
////			sc.init(null, new TrustManager[] { simpleVerifier }, null);
//            sc.init(null, new TrustManager[]{simpleVerifier}, new java.security.SecureRandom());
//            sslIOSessionStrategy = new SSLIOSessionStrategy(sc, simpleVerifier);
//        } catch (KeyManagementException e) {
//            throw new HttpProcessException(e);
//        }
//        return sslIOSessionStrategy;
//    }

    public SSLs customSSL(String keyStorePath, String keyStorepass) throws HttpProcessException {
        FileInputStream instream = null;
        KeyStore trustStore = null;
        try {
            trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            instream = new FileInputStream(new File(keyStorePath));
            trustStore.load(instream, keyStorepass.toCharArray());
            // 相信自己的CA和所有自签名的证书
            sc = SSLContexts.custom().loadTrustMaterial(trustStore, new TrustSelfSignedStrategy()).build();
        } catch (KeyManagementException e) {
            throw new HttpProcessException(e);
        } catch (KeyStoreException e) {
            throw new HttpProcessException(e);
        } catch (FileNotFoundException e) {
            throw new HttpProcessException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new HttpProcessException(e);
        } catch (CertificateException e) {
            throw new HttpProcessException(e);
        } catch (IOException e) {
            throw new HttpProcessException(e);
        } finally {
            try {
                instream.close();
            } catch (IOException e) {
            }
        }
        return this;
    }

    public SSLContext getSSLContext() throws HttpProcessException {
        try {
            if (sc == null) {
                sc = SSLContext.getInstance("SSLv3");
            }
            return sc;
        } catch (NoSuchAlgorithmException e) {
            throw new HttpProcessException(e);
        }
    }
}