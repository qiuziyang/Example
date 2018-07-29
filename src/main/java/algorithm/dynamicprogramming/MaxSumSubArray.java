package algorithm.dynamicprogramming;

/**
 * @Author qiuziyang_i
 * @Date 18/7/25 上午9:44
 * 求解给定数组的子数组，使得子数组的和最大，子数组的元素在给定的数组中必须是连续的
 */
public class MaxSumSubArray {

    /**dp解法：
    * 可以令curMax[]是以当前元素结尾的最大子数组和，maxSum是全局的最大子数组和，
    * 当往后扫描时，对第j个元素有两种选择：要么放入前面找到的子数组，要么做为新子数组的第一个元素
    * 举个例子，当输入数组是1, -2, 3, 10, -4, 7, 2, -5，那么，currSum和maxSum相应的变化为：
    *
    * j(前j个元素): 0    1     2    3     4    5     6     7     8
    * currSum[] :  0   1     -1    3    13    9    16    18    13
    * maxSum[]  :  0   1     1     3    13    13   16    18    18
    *
    *
    * 1.起始阶段(i=0)，max = nums[0]；
    * 2.第i(i > 0)个阶段，max = curMax[i]，curMax是第i个阶段的最大子序列和；
    * 3.第i-1和第i个阶段的关系，curMax[i] = Math.max(curMax[i - 1] + nums[i], nums[i])；
    * 4.根据前面动态规划的定义，则最大子序列和max = Math.max(max, curMax[i])
    * */


    public static int DpMaxSubArray(int[] nums) {
        //curMax是当前的最大子序列和
        int[] curMax = new int[nums.length];
        //起始阶段
        curMax[0] = nums[0];
        //刻画最优解
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //每一阶段的最优都有上一阶段的最优的基础上而来
            curMax[i] = Math.max(curMax[i - 1] + nums[i], nums[i]);
            System.out.print(curMax[i] + " ");
            max = Math.max(max, curMax[i]);
        }
        return max;
    }

    public static void main(String [] agrs){
        int [] a={1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println("a"+MaxSumSubArray.DpMaxSubArray(a));

    }
}
