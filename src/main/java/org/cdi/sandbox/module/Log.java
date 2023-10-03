package org.cdi.sandbox.module;


import jakarta.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;



import static java.lang.annotation.RetentionPolicy.RUNTIME;

@InterceptorBinding
@Retention(RUNTIME)
public @interface Log {
}
