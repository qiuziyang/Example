package threads;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午4:34
 */
class testRun extends Thread{
    ThreadLocal<Integer> temp;
    public testRun(ThreadLocal<Integer> temp){

        this.temp=temp;
        temp.set(22);
        System.out.println(temp.get());
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" | "+temp.get());
            temp.set(temp.get()+1);
        }
    }
}

