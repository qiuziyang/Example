package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/5 下午8:57
 */
public class BaseSort {
    public static int findMax(Integer a[]){
        if(a.length<1){
            return -1;
        }
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    public static void baseSort(Integer a[],int max){
        Integer[] bucket=new Integer[max+1];

        for (int i=0;i<bucket.length;i++){
            bucket[i]=0;
        }

        for(int i=0;i<a.length;i++){
            bucket[a[i]]++;
        }
        int k=0;
        for(int j=0;j<bucket.length;j++){
            while (bucket[j]>0){
                a[k++]=j;
                bucket[j]--;
            }
        }

    }

    public static void main(String[] args){
        Integer a[]={3,5,4,2,9,1};

        baseSort(a,findMax(a));
        for(int b:a){
            System.out.println(b);
        }
    }
}
