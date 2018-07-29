package decoratormodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午11:06
 */
public class test {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能：飞行");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("增加新的功能：水里游");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

        System.out.println("增加自动");
        AICar aiCar=new AICar(waterCar2);
        aiCar.move();
    }
}
