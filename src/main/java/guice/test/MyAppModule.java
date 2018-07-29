package guice.test;

import com.google.inject.AbstractModule;

/**
 * @Author qiuziyang_i
 * @Date 18/7/22 下午3:51
 */
public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        bind(Application.class).to(MyApp.class);
    }
}
