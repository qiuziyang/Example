package spring;

import java.lang.annotation.*;

/**
 * @Author qiuziyang_i
 * @Date 18/7/17 下午7:01
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    public enum color {GREEM, RED, YELLOW}

    color retrunColor() default color.YELLOW;
}
