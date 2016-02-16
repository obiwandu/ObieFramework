package org.smart4j.chapter3.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter3.annotation.Aspect;
import org.smart4j.chapter3.annotation.Controller;
import org.smart4j.chapter3.proxy.AspectProxy;

import java.lang.reflect.Method;

/**
 * Created by User on 2/16/2016.
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    private long begin;

    @Override
    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        LOGGER.debug("----------begin----------");
        LOGGER.debug(String.format("class: %s", cls.getName()));
        LOGGER.debug(String.format("method: %s", method.getName()));
        begin = System.currentTimeMillis();
    }

    @Override
    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        LOGGER.debug(String.format("time: %dms", System.currentTimeMillis() - begin));
        LOGGER.debug("----------end----------");
    }
}
