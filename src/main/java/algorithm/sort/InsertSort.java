package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/3 下午9:24
 */
public class InsertSort {
    public static void insertSort(Integer [] a){
        int preIndex,current;
        for(int i=1;i<a.length;i++){
            preIndex=i-1;
            current=a[i];
            while (preIndex>=0&&a[preIndex]>current){
                a[preIndex+1]=a[preIndex];
                preIndex--;
            }
            a[preIndex+1]=current;
        }
    }

    public static void main(String[] args){
        Integer a[]={3,5,4,2,9,1};
        insertSort(a);
        for(int b:a){
            System.out.println(b);
        }
    }
}
