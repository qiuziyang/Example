package chainmodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/7 上午9:43
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
