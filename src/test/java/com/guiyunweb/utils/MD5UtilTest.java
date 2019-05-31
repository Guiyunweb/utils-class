package com.guiyunweb.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilTest {

    @Test
    public void hex() {
        String email = "i@guiyunweb.com";
        String hash = MD5Util.md5Hex(email);
        System.out.println(hash);
    }
}