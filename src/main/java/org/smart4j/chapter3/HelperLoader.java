package org.smart4j.chapter3;

import org.smart4j.chapter3.helper.BeanHelper;
import org.smart4j.chapter3.helper.ClassHelper;
import org.smart4j.chapter3.helper.ControllerHelper;
import org.smart4j.chapter3.helper.IocHelper;
import org.smart4j.chapter3.utils.ClassUtil;

/**
 * Created by User on 2/2/2016.
 */
public class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), false);
        }
    }
}
