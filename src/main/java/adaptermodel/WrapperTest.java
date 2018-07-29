package adaptermodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午10:28
 */
public class WrapperTest {
    public static void  main(String[] args){
        Source source=new Source();
        Targetable targetable=new Wrappr(source);
        targetable.method1();
        targetable.method2();
    }
}
