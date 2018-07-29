package guice.test;

/**
 * @Author qiuziyang_i
 * @Date 18/7/22 下午3:48
 */
public class UserServiceImpl implements UserService {
    @Override
    public void process() {
        System.out.println("我需要做一些业务逻辑");
    }
}