package pagereplacement;

/**
 * @Author qiuziyang_i
 * @Date 18/8/1 下午11:09
 */
public class FIFO {

    int [] array;
    int maxSize=3;
    int curSize=0;
    public FIFO(){
        array=new int[3];
    }
    public void enque(int x){
        if(curSize==maxSize){
            for(int i=0;i<maxSize-1;i++){
                array[i]=array[i+1];
            }
            array[maxSize-1]=x;
        }else {
            array[curSize]=x;
            curSize++;
        }
        for(int i=0; i<curSize; i++) {
            System.out.print(array[i] + "        ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Integer iter[] = {7,0,1,2,0,3,0,4,2,3,0,3,2,1,2,0,1,7,0,1};
        FIFO fifo = new FIFO();
        for(int i=0; i<iter.length; i++) {
            fifo.enque(iter[i]);
        }
        }


}
