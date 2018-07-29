package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午8:47
 */
public class BubbleSort {

    public static void bubble(Integer a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                   swap(a,j,j+1);
                }
            }
        }
    }

    public static void swap(Integer a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args){
       Integer a[]={3,5,4,2,9,1};
        bubble(a);
       for(int b:a){
           System.out.println(b);
       }
    }
}
