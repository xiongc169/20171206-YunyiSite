package com.yunyi.web.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.sql.Connection;
import java.util.Properties;

@Intercepts(value = {@Signature(type = StatementHandler.class, method = "prepare", args = Connection.class)})
public class PagePlugin implements Interceptor {

    public Object intercept(Invocation arg0) throws Throwable {
        // TODO Auto-generated method stub
        return null;
    }

    public Object plugin(Object arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    public void setProperties(Properties arg0) {
        // TODO Auto-generated method stub
    }
}
