package chainmodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午9:44
 */
public class MyHandler extends AbstractHandler implements Handler{
    private String name;

    public MyHandler(String name){
        this.name=name;
    }


    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
