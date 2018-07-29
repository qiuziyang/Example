package strategymodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午9:34
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
