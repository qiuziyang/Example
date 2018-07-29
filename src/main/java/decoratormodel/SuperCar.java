package decoratormodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午7:56
 */
public class SuperCar implements ICar{
    private ICar car;
    public SuperCar(ICar car){
        this.car=car;
    }
    @Override
    public void move() {
       car.move();
    }
}
