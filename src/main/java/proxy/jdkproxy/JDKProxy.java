package proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午12:38
 */
public class JDKProxy implements InvocationHandler {


    private Object target;

    public Object newProxy(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object ret = null;
        if("addUser".equals(method.getName())){
            checkPopedom();
        }
        ret=method.invoke(target,args);

        return ret;
    }

    public void checkPopedom(){
        System.out.println("模拟jdk proxy 权限校验");
    }
}
