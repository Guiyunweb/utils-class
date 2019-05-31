package com.guiyunweb.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;

import java.io.*;

/**
 * 图片工具类
 */
public class ImageUtil {
    /**
     * 将图片转为Base64编码
     *
     * @param path
     * @return
     */
    public static String getImageBase64Code(String path) {
        InputStream in = null;
        byte[] data = null;

        try {
            in = new FileInputStream(path);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Base64.encodeBase64String(data);
    }

    /**
     * 解析Base64编码为图片
     *
     * @param data
     * @param path
     * @return
     */
    public static boolean generateImageByBase64Code(String data, String path) {
        if (StringUtils.isNotBlank(data) && StringUtils.isNotBlank(path)) {
            byte[] b = Base64.decodeBase64(data);
            for (int i = 0; i < b.length; i++) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            try {
                OutputStream out = new FileOutputStream(path);
                out.write(b);
                out.flush();
                out.close();
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
