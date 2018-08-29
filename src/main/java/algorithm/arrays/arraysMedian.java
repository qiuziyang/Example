package algorithm.arrays;

import java.util.ArrayList;

/**
 * @Author qiuziyang_i
 * @Date 18/8/2 上午10:58
 * 求两个有序数组的中位数或者第k小元素
 */
public class arraysMedian {

        static double findMedianSortedArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
            int n = nums1.size();
            int m = nums2.size();
            //保证数组1一定最短
            if (n > m)
            {
                return findMedianSortedArrays(nums2, nums1);
            }
            int L1=0, L2=0, R1=0, R2=0, c1=0, c2=0, lo = 0, hi = 2 * n;
            //我们目前是虚拟加了'#'所以数组1是2*n长度
            //二分
            while (lo <= hi)
            {
                //c1是二分的结果
                c1 = (lo + hi) / 2;
                c2 = m + n - c1;
                //map to original element
                L1 = (c1 == 0) ? Integer.MAX_VALUE : nums1.get((c1 - 1)/ 2);
                R1 = (c1 == 2 * n) ? Integer.MAX_VALUE : nums1.get(c1 / 2);
                L2 = (c2 == 0) ? Integer.MIN_VALUE : nums1.get((c2 - 1) / 2);
                R2 = (c2 == 2 * m) ? Integer.MAX_VALUE : nums2.get(c2 / 2);

                if (L1 > R2)
                {
                    hi = c1 - 1;
                }
                else if (L2 > R1)
                {
                    lo = c1 + 1;
                }
                else
                {
                    break;
                }
            }
            return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
        }


        public static void main(String[] args){
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(1);
            arrayList.add(4);
            arrayList.add(7);
            arrayList.add(9);
            ArrayList<Integer> arrayList1=new ArrayList<>();
            arrayList1.add(2);
            arrayList1.add(3);
            arrayList1.add(5);
            System.out.println(findMedianSortedArrays(arrayList,arrayList1));
        }
}
