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

    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0);
    }

    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }
}
