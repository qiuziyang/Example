package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qiuziyang_i
 * @Date 18/7/5 下午8:07
 */
public class MergeSort {

    private static void mergeSort(Integer[] a, int left, int right) {
        if(left>=right)
        {
            return;
        }

        int mid = (left + right) / 2;
        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);

    }

    private static void merge(Integer[] a, int left, int mid, int right) {

        int[] tmp = new int[a.length];
        int r1 = mid + 1;
        int tIndex = left;
        int cIndex=left;
        // 逐个归并
        while(left <=mid && r1 <= right) {
            if (a[left] <= a[r1])
            {
                tmp[tIndex++] = a[left++];
            }
            else
            {
                tmp[tIndex++] = a[r1++];
            }
        }
        // 将左边剩余的归并
        while (left <=mid) {
            tmp[tIndex++] = a[left++];
        }
        // 将右边剩余的归并
        while ( r1 <= right ) {
            tmp[tIndex++] = a[r1++];
        }
        //从临时数组拷贝到原数组
        while(cIndex<=right){
            a[cIndex]=tmp[cIndex];
            cIndex++;
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        Integer a[] = {3, 5, 4, 2, 9, 1};
        mergeSort(a,0,a.length-1);
        for (int b : a) {
            System.out.println(b);
        }
    }
}
