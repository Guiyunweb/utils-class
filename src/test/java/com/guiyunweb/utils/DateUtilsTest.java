package com.guiyunweb.utils;

import org.junit.Test;

import java.util.Date;

public class DateUtilsTest {

    @Test
    public void getAfterDaysTime() {
        System.out.println(DateUtil.getDateStringAccurateDay(DateUtil.getAfterDaysTime(new Date(),1)));
    }

    @Test
    public void getDateStringAccurateSecond() {
        System.out.println(DateUtil.getDateStringAccurateSec(DateUtil.getAfterMonsTime(new Date(),1)));
    }
}