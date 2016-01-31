package org.smart4j.chapter3.helper;

import jdk.nashorn.internal.ir.LiteralNode;
import org.smart4j.chapter3.utils.ArrayUtil;
import org.smart4j.chapter3.utils.CollectionUtil;
import org.smart4j.chapter3.annotation.Inject;
import org.smart4j.chapter3.utils.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by User on 1/31/2016.
 */
public class IocHelper {
    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();

                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    for (Field beanField : beanFields) {
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
