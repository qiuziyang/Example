package threads.ThreadPools;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author qiuziyang_i
 * @Date 18/7/3 下午2:58
 */
public class MyThreadFactory implements ThreadFactory{

    private AtomicInteger num=new AtomicInteger(1);
    private final String prefixName="qiuziyang-";

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(prefixName+num.getAndIncrement());
    }
}
