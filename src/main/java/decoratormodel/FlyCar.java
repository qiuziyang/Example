package decoratormodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午8:04
 */
public class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞");
    }
    @Override
    public void move(){
        super.move();
        fly();
    }
}
