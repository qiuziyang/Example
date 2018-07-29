package designmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qiuziyang_i
 * @Date 18/7/6 下午7:26
 */
public class WechatServer implements  Observerable {

    private List<Observer> list;
    private String message;

    public WechatServer(){
        list=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!list.isEmpty()){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
       for(int i=0;i<list.size();i++){
           Observer observer=list.get(i);
           observer.update(message);
       }
    }

    public void setInfomation(String s){
        this.message=s;
        System.out.println("微信服务器更新消息:"+s);
        notifyObserver();
    }

}
