package com.model.crypto;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

public class Util {

    public static final Charset UTF8 = StandardCharsets.UTF_8;
    public static final Charset UTF16 = StandardCharsets.UTF_16;

    public static byte[] getRandom(byte[] bytes) {
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(bytes);
        return bytes;
    }

    public static String getRandomString(int length) {
        byte[] randomBytes = getRandom(new byte[length]);
        return Base64.getEncoder().encodeToString(randomBytes);
    }
}
