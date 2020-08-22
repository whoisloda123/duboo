package com.liucan.dubbo.api;

/**
 * 提供公共接口
 *
 * @author liucan
 * @version 2020/8/22
 */
public interface CostService {

    /**
     * 购买消费金额
     *
     * @param cost 消费金额
     * @return 有消费的总金额
     */
    Integer add(int cost);
}
