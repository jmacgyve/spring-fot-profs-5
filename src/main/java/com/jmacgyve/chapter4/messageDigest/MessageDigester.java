package com.jmacgyve.chapter4.messageDigest;

import java.security.MessageDigest;

public class MessageDigester {
    private MessageDigest digest1;
    private MessageDigest digest2;

    public void setDigest2(MessageDigest digest2) {
        this.digest2 = digest2;
    }

    public void setDigest1(MessageDigest digest1) {
        this.digest1 = digest1;
    }

    public void digest(String msg) {
        System.out.println("digest1");
        digest(digest1, msg);
        System.out.println("digest2");
        digest(digest2, msg);
    }

    private void digest(MessageDigest digest, String msg) {
        System.out.println("Использую алгоритм --- " + digest.getAlgorithm());
        digest.reset();

        byte[] bytes = msg.getBytes();
        byte[] out = digest.digest(bytes);
        System.out.println(out);
    }
}
