package com.liucan.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liucan
 * @version 2020/8/23
 */
@RestController
@RequestMapping("customer")
public class CustomController {

    @Autowired
    private CustomerService customerService;

    /**
     * 添加完 返回总共消费
     */
    @RequestMapping("add")
    public String add(Integer a) {
        return customerService.custom(a).toString();
    }
}
