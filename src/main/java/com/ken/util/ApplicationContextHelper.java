package com.ken.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 在ApplicationContext环境外获取bean的工具类
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware {


    /**
     * 向ApplicationContextHolder里设置ApplicationContext
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextHolder.getInstance().setApplicationContext(applicationContext);
    }

    /**
     * 获得ApplicationContext
     *
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return ApplicationContextHolder.getInstance().getApplicationContext();
    }

    /**
     * 根据class获得bean
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> clazz) {
        return ApplicationContextHolder.getInstance().getApplicationContext().getBean(clazz);
    }

    /**
     * 根据id获得bean
     *
     * @param id
     * @param <T>
     * @return
     */
    public static <T> T getBean(String id) {
        return (T) ApplicationContextHolder.getInstance().getApplicationContext().getBean(id);
    }

}
