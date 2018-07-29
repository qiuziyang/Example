package designmodel;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午7:00
 */
public interface Observerable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}

