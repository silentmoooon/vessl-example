package org.vessl.test.aop;

import net.sf.cglib.core.Signature;
import org.vessl.bean.ClassExecuteHandler;
import org.vessl.bean.MethodExecutor;
import org.vessl.bean.Order;

import java.lang.annotation.Annotation;

@Order(1)
public class TestExecHandle1 implements ClassExecuteHandler {
    @Override
    public Class<? extends Annotation>[] targetAnnotation() {
        return new Class[]{TestLog.class};
    }

    @Override
    public void beforeHandle(Signature signature, Object[] args) {
        System.out.println("before1 "+signature.getName());
    }

    @Override
    public void afterHandle(Signature signature) {
        System.out.println("after1 "+signature.getName());
    }

    @Override
    public Object handle(MethodExecutor methodExecutor) throws Throwable {
        System.out.println("handleing1 "+methodExecutor.getSignature().getName());
        return methodExecutor.invoke();
    }

    @Override
    public void afterReturn(Signature signature, Object[] args, Object result) {

    }

    @Override
    public void afterException(Signature signature, Object[] args, Throwable e) {

    }
}
