package threads;

/**
 * @Author qiuziyang_i
 * @Date 18/7/2 下午4:40
 */
public class Test {
    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();


    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final Test test;
        try {
            test = (Test) Class.forName("threads.Test").newInstance();
            System.out.println("classLoader:"+test.getClass().getClassLoader());
            test.set();
            System.out.println(test.getLong());
            System.out.println(test.getString());


            Thread thread1 = new Thread(){
                public void run() {
                    test.set();
                    System.out.println(test.getLong());
                    System.out.println(test.getString());
                };
            };
            thread1.start();
            thread1.join();

            System.out.println(test.getLong());
            System.out.println(test.getString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
