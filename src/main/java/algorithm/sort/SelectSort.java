package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午9:40
 */
public class SelectSort {

    public static void select(Integer a[]) {
        for (int i = 0; i < a.length; i++) {
           swap(a,i,min(a,i));
        }
    }

    public static int min(Integer a[],int start){
        int min=a[start];
        int minIndex=start;
        for(int i=start;i<a.length;i++){
            if(min>a[i]) {
                min=a[i];
                minIndex=i;
            }
        }
        return minIndex;
    }


    public static void swap(Integer a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer a[] = {3, 5, 4, 2, 9, 1};
        select(a);
        for (int b : a) {
            System.out.println(b);
        }
    }
}
