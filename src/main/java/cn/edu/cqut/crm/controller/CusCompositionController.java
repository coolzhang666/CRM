package cn.edu.cqut.crm.controller;


import cn.edu.cqut.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ReportView")
public class CusCompositionController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/cusCompositon")
    public List<Integer> cusCompositon(){
//        List<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        return a;

        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        a.add("一级会员");
        a.add("二级会员");
        a.add("高级会员");
        a.add("黑卡级会员");

        b.add("1");
        b.add("2");
        b.add("3");
        b.add("4");
        b.add("5");
        for(String string:a) {
            Integer vip = customerService.getVip(string);
            result.add(vip);
        }

        for(String string:b) {
            Integer credit = customerService.getCredit(string);
            result.add(credit);
        }

        for(String string:b) {
            Integer satisfaction = customerService.getSatisfaction(string);
            result.add(satisfaction);
        }
        return result;
    }
}
