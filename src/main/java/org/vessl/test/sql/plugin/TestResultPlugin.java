package org.vessl.test.sql.plugin;

import org.vessl.sql.handle.MapperInvoker;
import org.vessl.sql.plugin.MapperPlugin;
import org.vessl.sql.plugin.PluginInterceptor;
import org.vessl.sql.plugin.PluginType;

@MapperPlugin(PluginType.RESULT)
public class TestResultPlugin implements PluginInterceptor {
    @Override
    public Object intercept(MapperInvoker invoker) throws Exception {
        System.out.println("vessl-sql plugin result start:"+invoker.getArgs().length);
        Object invoke = invoker.invoke();
        System.out.println("vessl-sql plugin result end:"+invoker.getArgs().length);
        return invoke;

    }
}
