package org.obie.obieframework.bean;

import org.obie.obieframework.utils.CastUtil;

import java.util.Map;

/**
 * Created by User on 2/2/2016.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
