package rpc.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author qiuziyang_i
 * @Date 18/6/29 下午10:29
 */
public class ServiceImpl extends UnicastRemoteObject implements IService {
    private static final long serialVersionUID = 1L;

    protected ServiceImpl() throws RemoteException {
    }

    @Override
    public String queryName(String no) throws RemoteException {
        System.out.println("hello rmi" + no);
        return String.valueOf(System.currentTimeMillis());
    }
}
