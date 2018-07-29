package adaptermodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午10:26
 */
public class Wrappr implements Targetable {

    private Source source;

    public Wrappr(Source source){
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the  targetable method!");
    }
}
