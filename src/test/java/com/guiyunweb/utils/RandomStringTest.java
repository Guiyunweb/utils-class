package com.guiyunweb.utils;

import org.junit.Test;


public class RandomStringTest {

    @Test
    public void main() {

        System.out.println(RandomStringUtil.getRandomString(32));
        System.out.println(RandomStringUtil.getRandomChar(32));
        System.out.println(RandomStringUtil.getUUID());

        System.out.println(RandomStringUtil.getPasswordSimple(1, 5));
        System.out.println(RandomStringUtil.getRandomString(8));
    }
}