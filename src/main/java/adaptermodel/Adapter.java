package adaptermodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午10:09
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
