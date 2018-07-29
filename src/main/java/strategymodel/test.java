package strategymodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午9:35
 */
public class test {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new plus();
        int result = cal.calculate(exp);
        System.out.println(result);

        exp="9-10";
        cal = new Minus();
        System.out.println(cal.calculate(exp));
    }
}
