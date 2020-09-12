package com.liucan.customer;

/**
 * @author liucan
 * @version 2020/9/7
 */
public class MyConnection implements Connection {
    public void onConnection() {
        System.out.println("fsfs");
    }

    public void onDisconnection() {
        System.out.println("sfsfs");
    }
}
