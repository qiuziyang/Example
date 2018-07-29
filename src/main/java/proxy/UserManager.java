package proxy;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午12:35
 */
public interface UserManager {

    void addUser(String id, String password);

    void delUser(String id);
}
