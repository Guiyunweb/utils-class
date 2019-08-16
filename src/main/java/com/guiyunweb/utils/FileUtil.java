package com.guiyunweb.utils;

import java.io.File;
import java.util.ArrayList;

/**
 * 文件工具类
 */
public class FileUtil {


    /**
     * 得到路径下的所有文件名
     *
     * @param path
     * @return
     */
    public static ArrayList<String> getFileNames(String path) {
        ArrayList<String> files = new ArrayList<String>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].getName());
            }
        }
        return files;
    }
}
