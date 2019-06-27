package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.Order;
import cn.edu.cqut.crm.model.OrderStatistics;
import cn.edu.cqut.crm.service.OrderService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orderTotalPrice", method = RequestMethod.GET)
    public Map<String,List> getAllOrder(){
        List<String> xlist = new ArrayList<>();
        List<Double> slist = new ArrayList<>();
        List<OrderStatistics> list = orderService.getAllOrder();
        for (OrderStatistics o:list){
            xlist.add(o.getStatisticsCustomerName());
            slist.add(o.getStatisticsTotalPrice());
        }
        Map<String,List> map = new HashMap<>();
        map.put("xlist",xlist);
        map.put("slist",slist);
        return map;
    }

    @RequestMapping(value = "/orderName", method = RequestMethod.GET)
    public Map<String,List> getOrderName(){
        List<String> xlist = new ArrayList<>();
        List<Double> slist16 = new ArrayList<>();
        List<Double> slist17 = new ArrayList<>();
        List<Double> slist18 = new ArrayList<>();
        List<Double> slist19 = new ArrayList<>();

        List<OrderStatistics> list16 = orderService.getYear16();
        List<OrderStatistics> list17 = orderService.getYear17();
        List<OrderStatistics> list18 = orderService.getYear18();
        List<OrderStatistics> list19 = orderService.getYear19();

        for (OrderStatistics o:list16){
            xlist.add(o.getStatisticsCustomerName());
            slist16.add(o.getStatisticsTotalPrice());
        }
        for (OrderStatistics o:list17){
            xlist.add(o.getStatisticsCustomerName());
            slist17.add(o.getStatisticsTotalPrice());
        }
        for (OrderStatistics o:list18){
            xlist.add(o.getStatisticsCustomerName());
            slist18.add(o.getStatisticsTotalPrice());
        }
        for (OrderStatistics o:list19){
            xlist.add(o.getStatisticsCustomerName());
            slist19.add(o.getStatisticsTotalPrice());
        }

//        System.out.println("xlist"+xlist);
//        System.out.println("slist"+slist16);
        Map<String,List> map = new HashMap<>();
        map.put("xlist",xlist);
        map.put("slist16",slist16);
        map.put("slist17",slist17);
        map.put("slist18",slist18);
        map.put("slist19",slist19);
        return map;
    }
}
