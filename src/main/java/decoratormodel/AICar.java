package decoratormodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午11:04
 */
public class AICar  extends SuperCar{
    public AICar(ICar car){
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑");
    }

    @Override
    public void move(){
        super.move();
        autoMove();
    }
}
