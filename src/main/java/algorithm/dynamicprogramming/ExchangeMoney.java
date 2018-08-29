package algorithm.dynamicprogramming;

/**
 * @Author qiuziyang_i
 * @Date 18/7/30 下午11:19
 */
public class ExchangeMoney {

    static int dimes[] = {1, 2, 5, 10};


    static int coinExchangeRecursion(int n, int m) //递归方式实现，更好理解
    {
        if (n == 0)   //跳出递归的条件
        {
            return 1;
        }
        if (n < 0 || m == 0)
        {
            return 0;
        }

        return (coinExchangeRecursion(n, m-1) + coinExchangeRecursion(n-dimes[m-1], m));
        //分为两种情况:换取当前面值的情况 + 没有换取当前面值的情况
    }

    public static void main(String [] args){
        int num=coinExchangeRecursion(100, 4);
        System.out.println(num);
    }
}
