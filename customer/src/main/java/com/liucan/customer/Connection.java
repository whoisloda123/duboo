package com.liucan.customer;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author liucan
 * @version 2020/9/7
 */
@SPI
public interface Connection {

    void onConnection();

    void onDisconnection();
}
