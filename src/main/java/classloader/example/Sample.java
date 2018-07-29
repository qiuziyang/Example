package classloader.example;

/**
 * @Author qiuziyang_i
 * @Date 18/7/1 上午11:55
 */
public class Sample {
    private Sample instance;

    public Sample getInstance() {
        return instance;
    }

    public void setSample(Object instance) {
        this.instance = (Sample) instance;
        System.out.println("set Sample:"+instance);
    }
}
