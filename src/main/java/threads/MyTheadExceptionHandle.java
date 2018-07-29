package threads;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午5:15
 */
public class MyTheadExceptionHandle implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        e.printStackTrace();
    }
}
