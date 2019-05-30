package com.guiyunweb.utils;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void getAfterDaysTime() {
        System.out.println(DateUtils.getYyMMdd(DateUtils.getAfterDaysTime(new Date(),1)));
    }

    @Test
    public void getAfterMonsTime() {
        System.out.println(DateUtils.getYyMMdd(DateUtils.getAfterMonsTime(new Date(),1)));
    }
}