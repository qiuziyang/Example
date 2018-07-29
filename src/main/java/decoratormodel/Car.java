package decoratormodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午7:53
 */
public class Car implements  ICar{
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}


