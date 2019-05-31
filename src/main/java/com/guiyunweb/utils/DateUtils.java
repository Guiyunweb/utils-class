package com.guiyunweb.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 */
public class DateUtils {

    /**
     * 得到任意天数后的日期
     *
     * @param date 时间
     * @param day  天数
     * @return
     */
    public static Date getAfterDaysTime(Date date, int day) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.DAY_OF_YEAR, day);
        return rightNow.getTime();
    }

    /**
     * 得到任意天数后的日期
     *
     * @param date 时间
     * @param mon  月数
     * @return
     */
    public static Date getAfterMonsTime(Date date, int mon) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH, mon);
        return rightNow.getTime();
    }

    /**
     * 时间格式化输出 精确到天
     * @param date
     * @return
     */
    public static String getDateStringAccurateDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    /**
     * 时间格式化输出 精确到秒
     * @param date
     * @return
     */
    public static String getDateStringAccurateSec(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 自定义时间格式化输出
     * @param date
     * @return
     */
    public static String format(Date date,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }


}
