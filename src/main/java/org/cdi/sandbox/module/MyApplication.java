package org.cdi.sandbox.module;


import jakarta.enterprise.inject.se.SeContainerInitializer;

public class MyApplication {

    public static void main(String[] args) {
        var initializer = SeContainerInitializer.newInstance();
        initializer.addBeanClasses(SimpleBean.class,LogInterceptor.class);

        var container = initializer.initialize();
        var myBean = container.select(org.cdi.sandbox.module.SimpleBean.class).get();
        myBean.SimpleCall();
    }
}
