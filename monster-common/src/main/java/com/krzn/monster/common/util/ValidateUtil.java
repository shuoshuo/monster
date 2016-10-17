package com.krzn.monster.common.util;

/**
 * @author yinxiao
 */
public class ValidateUtil {
    /**
     * 非空校验
     *
     * @param objects
     * @return
     */
    public static boolean isNotEmpty(Object... objects) {
        if (objects == null || objects.length < 1 || "".equals(objects)) {
            return false;
        }
        for (Object obj : objects) {
            if (obj == null || "null".equals(obj) || "".equals(obj)) {
                return false;
            }
        }
        return true;
    }
}
