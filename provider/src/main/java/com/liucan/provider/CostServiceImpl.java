package com.liucan.provider;

import com.liucan.dubbo.api.CostService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author liucan
 * @version 2020/8/23
 */
@Service
public class CostServiceImpl implements CostService {
    /**
     * 假设之前总花费了100
     */
    private final static Integer totalCost = 1000;

    /**
     * 之前总和 加上 最近一笔
     */
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}
