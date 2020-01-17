package com.blog.util;

import lombok.Data;

import java.util.Map;

@Data
public class CustomResult {
    private String message;
    private String code;
    private Map<String, Object> data;
    private volatile static CustomResult customResult;

    public static CustomResult success() {
        CustomResult customResult = getSingleton();
        customResult.setCode("200");
        customResult.setMessage("操作成功");
        customResult.setData(null);
        return customResult;
    }

    public static CustomResult error() {
        CustomResult customResult = getSingleton();
        customResult.setCode("500");
        customResult.setMessage("操作失败");
        customResult.setData(null);
        return customResult;
    }

    private CustomResult() {
    }

    /**
     * 单例模式-线程安全
     *
     * @return
     */
    private static CustomResult getSingleton() {
        if (customResult == null) {
            synchronized (CustomResult.class) {
                if (customResult == null) {
                    customResult = new CustomResult();
                }
            }
        }
        return customResult;
    }

}
