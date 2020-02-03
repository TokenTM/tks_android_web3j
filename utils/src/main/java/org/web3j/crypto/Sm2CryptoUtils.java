package org.web3j.crypto;

import org.web3j.utils.Numeric;

import sm_crypto.Sm_crypto;

/**
 * @author youxuan  E-mail:xuanyouwu@163.com
 * @Description
 */
public class Sm2CryptoUtils {

    public static String c_FromPrvKey(String prvKey) {
        return Sm_crypto.c_FromPrvKey(prvKey);
    }

    public static String c_GenerateKey() {
        return Sm_crypto.c_GenerateKey();
    }

    public static String c_Hash256Bysha3(String data) {
        String hashed = Sm_crypto.c_Hash256Bysha3(clearPrefix(data));
        return clearPrefix(hashed);
    }

    public static String c_Hash256Bysm3(String data) {
        return Sm_crypto.c_Hash256Bysm3(data);
    }

    public static String c_Sign(String data, String key) {
        String sign = Sm_crypto.c_Sign(clearPrefix(data), key);
        return clearPrefix(sign);
    }

    public static boolean c_VerifySignature(String var0, String var1, String var2) {
        return Sm_crypto.c_VerifySignature(var0, var1, var2);
    }

    public static String c_AddrFromPub(String publicKey) {
        return Sm_crypto.c_AddrFromPub(publicKey);
    }

    public static String clearPrefix(String data) {
        return Numeric.cleanHexPrefix(data);
    }
}
