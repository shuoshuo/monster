package com.krzn.monster.common.util;

import java.io.IOException;
import java.util.Properties;

/**
 * <p>DESCRIPTION:   读取properties文件工具类
 * <p>CALLED BY:	钱明金
 * <p>CREATE DATE: 2016/5/31
 *
 * @version 1.0
 * @since java 1.7.0
 */
public class ReadPropertiesUtil {
    private static Properties prop = new Properties();

    static {
        try {
            prop.load(ReadPropertiesUtil.class.getClassLoader().getResourceAsStream("kernel.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过key获得value值
     *
     * @param key
     * @return
     */
    public static String getString(String key) {
        return prop.getProperty(key);
    }
}
