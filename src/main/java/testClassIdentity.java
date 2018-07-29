package classloader;

import classloader.example.FileSystemClassLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author qiuziyang_i
 * @Date 18/6/30 下午12:17
 */
public class testClassIdentity {
    String classDataRootPath = "/Users/didi/Documents/codetest/";

    String className = "classloader.example.Sample";

    public void testClassIdentity() {
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        Class<?> class1 = null;
        try {
            class1 = fscl1.loadClass(className);

            Object obj1 = class1.newInstance();
            Class<?> class2 = fscl2.loadClass(className);
            System.out.println(class1.getClassLoader());

            Object obj2 = class2.newInstance();
            Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class);
            setSampleMethod.invoke(obj1, obj2);
            System.out.println(obj1);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        }
    }
    public static void main(String[] agrs){
        testClassIdentity classIdentity=new testClassIdentity();
        classIdentity.testClassIdentity();
    }

}

