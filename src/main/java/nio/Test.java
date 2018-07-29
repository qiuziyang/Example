package nio;

import java.util.Scanner;

/**
 * @Author qiuziyang_i
 * @Date 18/6/18 下午5:24
 */
public class Test {
    //测试主方法
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //运行服务器
        Server.start();
        //避免客户端先于服务器启动前执行代码
        Thread.sleep(100);
        //运行客户端
        Client.start();
        while (Client.sendMsg(new Scanner(System.in).nextLine())) ;
    }
}
