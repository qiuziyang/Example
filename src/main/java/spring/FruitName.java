package spring;

import java.lang.annotation.*;

/**
 * @Author qiuziyang_i
 * @Date 18/7/17 下午6:58
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String testValue() default "";
}
