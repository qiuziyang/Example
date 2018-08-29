package threads;

import java.util.BitSet;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午3:40
 */
public class threadLocal {






    public static void main(String[] args){
        ThreadLocal<Integer>  local = new ThreadLocal<Integer>(){
            @Override
            public Integer initialValue(){
                return 20;
            }
        };
        local.set(20);
        System.out.println(local.get());
        testRun testRun1=new testRun(local);
        testRun testRun2=new testRun(local);
        testRun testRun3=new testRun(local);
        testRun1.start();
        testRun2.start();
        testRun3.start();
        Lock lock = new ReentrantLock();
        Condition full = lock.newCondition();

    }


}
