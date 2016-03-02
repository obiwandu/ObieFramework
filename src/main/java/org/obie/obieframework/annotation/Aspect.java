package org.obie.obieframework.annotation;

import java.lang.annotation.*;

/**
 * Created by User on 2/16/2016.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
