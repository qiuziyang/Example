package rpc.client;

import rpc.service.IService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午10:33
 */
public class Client {
    public static void main(String[] args){
        Registry registry=null;
        try {

            registry= LocateRegistry.getRegistry("192.168.0.103",8888);

            String[] list=registry.list();
            for(String a:list){
                System.out.println(a);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        try {
            IService iService=(IService)registry.lookup("vince");
            String result=iService.queryName("ha ha ha ha ");
            System.out.println("result from remote : " + result);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
