package guice.test;

import com.google.inject.Inject;

/**
 * @Author qiuziyang_i
 * @Date 18/7/22 下午3:50
 */
public class MyApp implements Application {
    private UserService userService;
    private LogService logService;

    @Inject
    public MyApp(UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    @Override
    public void work() {
        userService.process();
        logService.log("程序正常运行");
    }
}
