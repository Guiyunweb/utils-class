package com.guiyunweb.utils;

import net.ipip.ipdb.City;
import net.ipip.ipdb.CityInfo;
import net.ipip.ipdb.IPFormatException;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * ip 工具类
 */
public class IpUtil {

    /**
     * 获取ip地址
     * 获取xff 请求端真实IP
     * XFF 的内容由「英文逗号 + 空格」隔开的多个部分组成，最开始的是离服务端最远的设备 IP，然后是每一级代理设备的 IP。
     * 如果一个 HTTP 请求到达服务器之前，经过了三个代理 Proxy1、Proxy2、Proxy3，
     * IP 分别为 IP1、IP2、IP3，用户真实 IP 为 IP0，
     * @param request
     * @return
     */
    public static String getIpAddress(HttpServletRequest request) {
        String xff = request.getHeader("X-Forwarded-For");
        String ip = null;
        if (xff != null) {
            String[] ips = xff.split(",");
            ip = ips[0];
        }
        return ip;
    }

    public static String getCity(String ip) {

        try {
            //这个根据ipipfree.ipdb 这个来查找
            File file = new File("classpath:ipipfree.ipdb");
            City db = new City(file.getPath());
            CityInfo info = db.findInfo(ip, "CN");
            return info.getCityName();
        } catch (IOException e) {
            System.out.println("文件读取失败");
        } catch (IPFormatException e) {
            System.out.println("ip解析失败");
        }
        return null;
    }
}
