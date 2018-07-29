package threads;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author qiuziyang_i
 * @Date 18/7/11 下午3:13
 */
public class testString {

    public static void main(String [] args){
        String sa = "ab";
        String sb = "cd";
        String sab=sa+sb;
        String s="abcd";
        System.out.println(sab==s); // false
    }
}
