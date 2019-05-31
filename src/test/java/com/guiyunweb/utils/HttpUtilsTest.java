package com.guiyunweb.utils;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HttpUtilsTest {

    @Test
    public void doGet() {
        String host = "http://localhost:8080";
        String path = "/hello";
        String method = "POST";
        Map<String, String> querys = new HashMap<String, String>();
        String bodys = "";
        Map<String, String> headers = new HashMap<String, String>();
        try {
            HttpResponse response = HttpUtil.doPost(host, path, method, headers, querys, bodys);
            //获取response的body
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}