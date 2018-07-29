package rpc.service;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午11:12
 */
public class Server {
    public static void main(String[] args){
        Registry registry=null;
        try {
            registry= LocateRegistry.createRegistry(8888);
            ServiceImpl service=new ServiceImpl();
            registry.rebind("vince",service);
            System.out.println("bind server");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
