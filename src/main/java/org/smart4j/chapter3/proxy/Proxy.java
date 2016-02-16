package org.smart4j.chapter3.proxy;

/**
 * Created by User on 2/16/2016.
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
