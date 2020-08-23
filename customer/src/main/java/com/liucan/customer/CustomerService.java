package com.liucan.customer;

import com.liucan.dubbo.api.CostService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author liucan
 * @version 2020/8/23
 */
@Service
public class CustomerService {

    @Reference
    private CostService costService;

    public Integer custom(int a) {
        return costService.add(a);
    }
}
