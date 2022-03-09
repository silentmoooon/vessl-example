package org.vessl.test.sql.plugin;

import org.vessl.sql.handle.MapperMethodInvoker;
import org.vessl.sql.plugin.Plugin;
import org.vessl.sql.plugin.PluginInterceptor;
import org.vessl.sql.plugin.PluginType;

@Plugin(PluginType.EXECUTE)
public class TestPlugin implements PluginInterceptor {
    @Override
    public Object intercept(MapperMethodInvoker invoker) throws Throwable {
        System.out.println("vessl-sql plugin");
        return invoker.invoke();
    }
}
