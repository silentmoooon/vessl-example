package org.vessl.test.aop;

import net.sf.cglib.core.Signature;
import org.vessl.bean.ClassExecuteHandler;
import org.vessl.bean.Handle;
import org.vessl.bean.MethodExecutor;

import java.lang.annotation.Annotation;

@Handle
public class TestExecHandle implements ClassExecuteHandler {
    @Override
    public Class<? extends Annotation>[] targetAnnotation() {
        return new Class[]{TestLog.class};
    }

    @Override
    public void beforeHandle(Signature signature, Object[] args) {
        System.out.println("before "+signature.getName());
    }

    @Override
    public void afterHandle(Signature signature) {
        System.out.println("after "+signature.getName());
    }

    @Override
    public Object handle(MethodExecutor methodExecutor) throws Throwable {
        System.out.println("handleing "+methodExecutor.getSignature().getName());
        return methodExecutor.invoke();
    }

    @Override
    public void afterReturn(Signature signature, Object[] args, Object result) {

    }

    @Override
    public void afterException(Signature signature, Object[] args, Throwable e) {

    }
}
