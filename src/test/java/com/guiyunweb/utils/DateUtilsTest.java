package com.guiyunweb.utils;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void getAfterDaysTime() {
        System.out.println(DateUtils.getDateStringAccurateDay(DateUtils.getAfterDaysTime(new Date(),1)));
    }

    @Test
    public void getDateStringAccurateSecond() {
        System.out.println(DateUtils.getDateStringAccurateSecond(DateUtils.getAfterMonsTime(new Date(),1)));
    }
}