package proxy.gclibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午12:51
 */
public class CGLibProxy implements MethodInterceptor {

    private Object target;

    public Object createProxyObject(Object target){
        this.target=target;
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object proxyObject=enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object object=null;
        if("addUser".equals(method.getName())){
            checkPopedom();
        }
        object=method.invoke(target,objects);
        return object;
    }


    public void checkPopedom(){
        System.out.println("模拟gclib proxy 权限校验");
    }
}
