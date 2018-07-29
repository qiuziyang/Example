package guice.test;

/**
 * @Author qiuziyang_i
 * @Date 18/7/22 下午3:49
 */
public class LogServiceImpl implements LogService {
    @Override
    public void log(String msg) {
        System.out.println("------LOG:" + msg);
    }
}