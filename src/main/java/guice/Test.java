package guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 下午9:36
 */
public class Test {
    public static void main(String[] args){
        // 定义注射规则
        MyModule myModule=new MyModule();
        // 根据注射规则，生成注射者
        Injector injector= Guice.createInjector(myModule);
        Client client=new Client();
        // 注射者将需要注射的bean,按照规则,把client这个客户端进行注射
        injector.injectMembers(client);
        client.myMethod();

    }
}
