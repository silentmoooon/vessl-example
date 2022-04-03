package org.vessl.test.sql.plugin;

import org.vessl.sql.handle.MapperInvoker;
import org.vessl.sql.plugin.MapperPlugin;
import org.vessl.sql.plugin.PluginInterceptor;
import org.vessl.sql.plugin.PluginType;

@MapperPlugin(PluginType.EXECUTE)
public class TestExecutePlugin implements PluginInterceptor {
    @Override
    public Object intercept(MapperInvoker invoker) throws Exception {
        System.out.println("vessl-sql plugin execute start:"+invoker.getArgs().length);
        Object invoke = invoker.invoke();
        System.out.println("vessl-sql plugin execute end:"+invoker.getArgs().length);
        return invoke;
    }
}
