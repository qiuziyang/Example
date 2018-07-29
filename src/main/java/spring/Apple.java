package spring;

/**
 * @Author qiuziyang_i
 * @Date 18/7/17 下午7:20
 */
public class Apple {

    @FruitName(testValue = "test")
    private String appleName;

    @FruitColor(retrunColor = FruitColor.color.GREEM)
    private String appleColor;

    @FruitProvider(id = 1,name = "provider1",address = "abc")
    private String appleProvider;
}
