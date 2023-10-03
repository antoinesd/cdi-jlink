package org.cdi.sandbox.module;


import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Dependent
@Interceptor
@Log
@Priority(Interceptor.Priority.LIBRARY_BEFORE)
public class LogInterceptor {



    @AroundInvoke
    Object timeMethod(InvocationContext context) throws Exception {
        System.out.println("*** before calling method " + context.getMethod().getName() + " ***");
        try {
            return context.proceed();
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("=== after calling method " + context.getMethod().getName() + " ===");
        }

    }
}