package org.smart4j.chapter3.utils;

/**
 * Created by User on 12/7/2015.
 */
public class CastUtil {
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }
}
