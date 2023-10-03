package org.cdi.sandbox.module;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SimpleBean {


    @Log
    public void SimpleCall() {
        System.out.println("***************\n" +
                           "*   I'm here  *\n" +
                           "***************\n");
    }


}
