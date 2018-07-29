package proxy;

import proxy.gclibproxy.CGLibProxy;
import proxy.jdkproxy.JDKProxy;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午1:02
 */
public class Client {
    public static void main(String[] args) {
        UserManager userManager=(UserManager)new CGLibProxy().createProxyObject(new UserManagerImpl());
        System.out.println("-----------CGLibProxy-------------");

        userManager.addUser("tom","root");

        System.out.println("-----------JDKProxy-------------");
        UserManager userManager1=(UserManager)new JDKProxy().newProxy(new UserManagerImpl());

        userManager1.addUser("cat","arius");



    }
}