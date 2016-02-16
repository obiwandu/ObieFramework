package org.smart4j.chapter3.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by User on 12/7/2015.
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String src, String pat) {
        return src.split(pat);
    }
}
