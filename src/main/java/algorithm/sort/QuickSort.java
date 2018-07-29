package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午9:04
 */
public class QuickSort {

    public static void quick(Integer a[],int left,int right ){
        if(left<right){
            int partition=partition(a,left,right);
            quick(a,left,partition-1);
            quick(a,partition+1,right);
        }
    }

    public static int partition(Integer a[] ,int left ,int right){
        int plot=left;
        int index=left+1;
        for(int j=left+1;j<=right;j++){
            if(a[j]<a[plot]){
                swap(a,index,j);
                index++;
            }
        }
        swap(a,left,index-1);
        return index-1;
    }

    public static void swap(Integer a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args){
        Integer a[]={3,5,4,2,9,1};
        quick(a,0,a.length-1);
        for(int b:a){
            System.out.println(b);
        }
    }
}
