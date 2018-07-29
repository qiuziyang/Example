package strategymodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午9:32
 */
public class plus extends AbstractCalculator {


    @Override
    public int calculate(String exp) {
        int arrayInt[] =split(exp,"\\+");

        return arrayInt[0]+arrayInt[1];
    }
}
