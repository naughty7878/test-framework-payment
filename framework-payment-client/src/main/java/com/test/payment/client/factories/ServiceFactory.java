package com.test.payment.client.factories;

import com.test.payment.client.util.SpringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

@Slf4j
public class ServiceFactory<T> implements FactoryBean<T> {
    private final Class<T> objectType;

    private volatile T object;

    public ServiceFactory(Class<T> objectType) {
        this.objectType = objectType;
    }

    @Override
    public Class<?> getObjectType() {
        return this.objectType;
    }

    @Override
    public synchronized T getObject()  {
        if(object == null) {
            try {
                object = SpringUtils.getBean(objectType);
            } catch (Exception e) {
                log.error("获取Beat失败!", e);
            }
        }
        return object;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
