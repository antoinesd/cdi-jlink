package org.cdi.sandbox.module;


import java.lang.annotation.Retention;

import javax.interceptor.InterceptorBinding;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@InterceptorBinding
@Retention(RUNTIME)
public @interface Log {
}
