package decoratormodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午11:03
 */
public class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水中游");
    }

    @Override
    public void move(){
        super.move();
        swim();
    }

}
