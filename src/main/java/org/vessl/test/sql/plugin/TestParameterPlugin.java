package org.vessl.test.sql.plugin;

import org.vessl.sql.handle.MapperInvoker;
import org.vessl.sql.plugin.MapperPlugin;
import org.vessl.sql.plugin.PluginInterceptor;
import org.vessl.sql.plugin.PluginType;

@MapperPlugin(PluginType.PARAMETER)
public class TestParameterPlugin implements PluginInterceptor {
    @Override
    public Object intercept(MapperInvoker invoker) throws Exception {
        System.out.println("vessl-sql plugin parameter start:"+invoker.getArgs().length);
        Object invoke = invoker.invoke();
        System.out.println("vessl-sql plugin parameter end:"+invoker.getArgs().length);
        return invoke;
    }
}
