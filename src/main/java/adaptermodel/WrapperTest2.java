package adaptermodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午10:56
 */
public class WrapperTest2 {
    public static void main(String[] args){
        Sourceable sourceable1= new SourceSub1();
        Sourceable sourceable2= new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
