package classloader.example;

import java.io.*;

/**
 * @Author qiuziyang_i
 * @Date 18/7/1 上午10:43
 */
public class FileSystemClassLoader extends ClassLoader {
    private  String rootDir;
    public FileSystemClassLoader(String rootDir) {
        this.rootDir = rootDir;
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        byte [] classdata;
        return null;
    }
    private byte[] getClassData(String className){
        String path=classNameToPath(className);
        try {
            InputStream ins=new FileInputStream(path);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            int bufferSize=4096;
            byte[] buffer=new byte[bufferSize];
            int bytesNumRead = 0;
            while ((bytesNumRead=ins.read(buffer))!=-1){
                baos.write(buffer,0,bytesNumRead);
            }
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    private String classNameToPath(String name){
        return rootDir+ File.separatorChar+name.replace('.',File.separatorChar)+".class";
    }
}
