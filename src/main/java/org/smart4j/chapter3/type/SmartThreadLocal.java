package org.smart4j.chapter3.type;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2/18/2016.
 */
public class SmartThreadLocal<T> {
    private Map<Thread, T> container = Collections.synchronizedMap(new HashMap<Thread, T>());

    public void set(T value) {
        container.put(Thread.currentThread(), value);
    }

    public T get() {
        Thread thread = Thread.currentThread();
        T value = container.get(thread);
        if (value == null && !container.containsKey(thread)) {
            value = initialValue();
            container.put(thread, value);
        }
        return value;
    }

    public void remove() {
        container.remove(Thread.currentThread());
    }

    /*Use protected to remind programmer to overload initialValue()*/
    protected T initialValue() {
        return null;
    }
}
