package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/3 下午7:46
 */
public class HeapSort {

    public static void createMaxHeap(Integer a[]){
        int i=(int)Math.floor(a.length/2);
        for(;i>=0;i--){
            fixDown(a,i,a.length);
        }
    }

    public static void fixDown(Integer a[],int i,int lenth){
       int left=2*i+1;
       int right=2*i+2;
       int largest=i;
       if(left<lenth&&a[left]>a[largest]){
           largest=left;
       }
       if(right<lenth&&a[right]>a[largest]){
           largest=right;
       }
       if(largest!=i){
           swap(a,i,largest);
           fixDown(a,largest,lenth);
       }
    }


    public static void sort(Integer a[]){

        createMaxHeap(a);
        for(Integer j:a){
            System.out.print(j);
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[0]);
            swap(a,0,i);
            fixDown(a,0,i);
        }
    }


    public static void main(String[] args){
        Integer a[]={3,5,4,2,9,1};
        sort(a);
    }

    public static void swap(Integer a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
