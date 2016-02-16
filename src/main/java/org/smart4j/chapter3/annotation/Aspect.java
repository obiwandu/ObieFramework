package org.smart4j.chapter3.annotation;

import java.lang.annotation.*;

/**
 * Created by User on 2/16/2016.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
