package spring;

import java.lang.annotation.*;

/**
 * @Author qiuziyang_i
 * @Date 18/7/17 下午7:04
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

    public int id() default  -1;

    public String name() default "";

    public String address() default "";
}
