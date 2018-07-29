package guice;

import com.google.inject.Inject;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 下午9:30
 */
public class Client {
    Myservice myservice;

    @Inject
    void setMyservice(Myservice myservice){
        this.myservice=myservice;
    }

    public void  myMethod(){
        myservice.myMethod();
    }
}
