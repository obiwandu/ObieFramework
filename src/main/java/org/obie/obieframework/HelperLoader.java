package org.obie.obieframework;

import org.obie.obieframework.helper.*;
import org.obie.obieframework.utils.ClassUtil;

/**
 * Created by User on 2/2/2016.
 */
public class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
