package com.liucan.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.List;

/**
 * 提供接口bean工厂
 *
 * @author liucan
 * @version 2020/8/30
 */
public class ServiceFactoryBean<T> implements FactoryBean<T> {

    private Class<T> interfaceClass;

    private List<String> userNames;

    /**
     * 通过动态代理方式生成对象
     */
    @Override
    public T getObject() throws Exception {
        return (T) Enhancer.create(interfaceClass, new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                if (method.getName().equals("getUserNames")) {
                    return userNames;
                }
                Object object = methodProxy.invokeSuper(o, objects);
                return object;
            }
        });
    }

    @Override
    public Class<?> getObjectType() {
        return interfaceClass;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public Class<T> getInterfaceClass() {
        return interfaceClass;
    }

    public void setInterfaceClass(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }
}
