package adaptermodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午10:17
 */
public class AdapterTest {
    public static void main(String[] agrs){
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
