package guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 下午9:33
 */
public class MyModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(Myservice.class).to(MyserviceImpl.class).in(Scopes.SINGLETON);
    }
}
