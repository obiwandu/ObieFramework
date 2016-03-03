package org.obie.obieframework.utils;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by User on 1/31/2016.
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
