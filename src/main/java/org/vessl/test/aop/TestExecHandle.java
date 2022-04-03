package org.vessl.test.aop;

import org.vessl.core.aop.Aop;
import org.vessl.core.aop.ExecuteInterceptor;
import org.vessl.core.aop.ProxyData;
import org.vessl.core.aop.ProxyExecutor;

import java.lang.annotation.Annotation;

@Aop
public class TestExecHandle implements ExecuteInterceptor {
    @Override
    public Class<? extends Annotation>[] targetAnnotation() {
        return new Class[]{TestLog.class};
    }

    @Override
    public void beforeHandle(ProxyData proxyData) {
        System.out.println("before "+proxyData.getSignature().getName());
    }

    @Override
    public void afterHandle(ProxyData proxyData) {
        System.out.println("after "+proxyData.getSignature().getName());
    }

    @Override
    public Object handle(ProxyExecutor proxyExecutor) throws Throwable {
        System.out.println("handleing "+ proxyExecutor.getSignature().getName());
        return proxyExecutor.invoke();
    }

    @Override
    public void afterReturn(ProxyData proxyData, Object result) {

    }

    @Override
    public void afterException(ProxyData proxyData, Throwable e) {

    }
}
