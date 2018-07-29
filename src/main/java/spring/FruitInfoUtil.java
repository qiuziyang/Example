package spring;

import java.lang.reflect.Field;

/**
 * @Author qiuziyang_i
 * @Date 18/7/17 下午7:09
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz){
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";
        Field[] fields=clazz.getDeclaredFields();
        for(Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName=(FruitName) field.getAnnotation(FruitName.class);
                strFruitName+=fruitName.testValue();
                System.out.println(strFruitName);
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor=(FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor+=fruitColor.retrunColor();
                System.out.println(strFruitColor);
            }else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider=(FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer+=fruitProvider.id()+" , "+fruitProvider.name()+" , "+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }

    }
}
