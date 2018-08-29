package algorithm.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author qiuziyang_i
 * @Date 18/8/3 上午10:18
 */
public class MedianOfSlidingWindow {

    public class minComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a > b) {
                return 1;
            } else if (a.equals(b)) {
                return 0;
            } else {
                return -1;
            }
        }
    }


    public class maxComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a > b) {
                return -1;
            } else if (a.equals(b)) {
                return 0;
            } else {
                return 1;
            }
        }
    }

//    public List<Integer> medianSlidingWindow(int[] nums, int k) {
//        List<Integer> res = new ArrayList<Integer>();
//        if (k == 0 || nums.length < k) {
//            return res;
//        }
//        PriorityQueue<Integer> maxQueue = new PriorityQueue<>();
//        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
//        int media=nums[0];
//        //最初的添加数据
//        for(int i=0;i<k;i++) {
//            if (media < nums[i]) {
//                minQueue.offer(nums[i]);
//            } else {
//                maxQueue.offer(nums[i]);
//            }
//            if (maxQueue.size() > minQueue.size()) {
//                minQueue.offer(media);
//                media = minQueue.poll();
//            }
//        }
//        res.add(media);
//        //后续的添加数据
//        for(int i=0;i<nums.length;i++){
//            if(media<nums[i]) {
//                minQueue.offer(nums[i]);
//            }else {
//                maxQueue.offer(nums[i]);
//            }
//            //移除当前窗口第一个值
//            int old= nums[i-k];
//
//        }
//

//    }

}
