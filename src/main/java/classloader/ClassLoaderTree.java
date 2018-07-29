package classloader;

/**
 * @Author qiuziyang_i
 * @Date 18/6/30 上午11:58
 */
public class ClassLoaderTree {
    public static void main(String[] args){
        ClassLoader classLoader=ClassLoaderTree.class.getClassLoader();
        while (classLoader!=null){
            System.out.println(classLoader.toString());
            classLoader=classLoader.getParent();
        }
    }
}
