package algorithm.sort;

/**
 * @Author qiuziyang_i
 * @Date 18/7/4 下午10:47
 */
public class ShellSort {
    public static void Shell(Integer a[]){
        int insertKey,cur;
        for(int increment=a.length/2;increment>0;increment/=2){
            for (int i=0;i<increment;i++){
                for(int j=i+increment;j<a.length;j+=increment){
                    insertKey=a[j];
                    cur=j-increment;
                    while (cur>=i&&a[cur]>insertKey){
                        a[cur+increment]=a[cur];
                        cur=cur-increment;
                    }
                    a[cur+increment]=insertKey;
                }
            }
        }
    }


    public static void main(String[] args) {
        Integer a[] = {3, 5, 4, 2, 9, 1};
        Shell(a);
        for (int b : a) {
            System.out.println(b);
        }
    }
}
