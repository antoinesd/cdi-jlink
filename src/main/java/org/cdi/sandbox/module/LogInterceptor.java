package org.cdi.sandbox.module;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Intercepted;
import javax.enterprise.inject.spi.Bean;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

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