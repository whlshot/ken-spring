package com.ken.util;

import org.springframework.context.ApplicationContext;

/**
 * 保存ApplicationContext的单例
 */
public class ApplicationContextHolder {

    private static ApplicationContextHolder applicationContextHolder = new ApplicationContextHolder();

    private ApplicationContext applicationContext;


    private ApplicationContextHolder() {
    }

    public static ApplicationContextHolder getInstance() {
        return applicationContextHolder;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
