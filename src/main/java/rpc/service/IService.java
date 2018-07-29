package rpc.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午10:28
 */
public interface IService extends Remote {
    public String queryName(String no) throws RemoteException;
}
