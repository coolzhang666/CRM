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

import java.text.SimpleDateFormat;
import java.util.*;

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
    public Map<String, List> getOrderName(){
        List<Order> list = orderService.getAllInfo();
        List<String> xlist = new ArrayList<>();
        List<Double> slist16 = new ArrayList<>();
        List<Double> slist17 = new ArrayList<>();
        List<Double> slist18 = new ArrayList<>();
        List<Double> slist19 = new ArrayList<>();
        for(Order o:list){
            if(!xlist.contains(o.getCustomerName())){
                xlist.add(o.getCustomerName());
            }
        }
        Double d = 0.0;
        for(int i=0;i<xlist.size();i++){
            d = 0.0;
            for(Order o:list){
                if (o.getOrderTime().getYear()+1900==2016){
                    if (o.getCustomerName().equals(xlist.get(i))){
                        d+=o.getTotalPrice();
                    }
                }
            }
            slist16.add(d);
            d=0.0;
            for(Order o:list){
                if (o.getOrderTime().getYear()+1900== 2017){
                    if (o.getCustomerName().equals(xlist.get(i))){
                        d+=o.getTotalPrice();
                    }
                }
            }
            slist17.add(d);
            d=0.0;
            for(Order o:list){
                if (o.getOrderTime().getYear()+1900== 2018){
                    if (o.getCustomerName().equals(xlist.get(i))){
                        d+=o.getTotalPrice();
                    }
                }
            }
            slist18.add(d);
            d=0.0;
            for(Order o:list){
                if (o.getOrderTime().getYear()+1900== 2019){
                    if (o.getCustomerName().equals(xlist.get(i))){
                        d+=o.getTotalPrice();
                    }
                }
            }
            slist19.add(d);
        }
        Map<String,List> map = new HashMap<>();
        map.put("xlist",xlist);
        map.put("slist16",slist16);
        map.put("slist17",slist17);
        map.put("slist18",slist18);
        map.put("slist19",slist19);
        return map;
    }

    @RequestMapping(value = "/orderYear", method = RequestMethod.GET)
    public Map<String,List> getOrderYear(){
        List<String> xlist = new ArrayList<>();
        xlist.add("2016");
        xlist.add("2017");
        xlist.add("2018");
        xlist.add("2019");

        Double year16 = orderService.getYear16Total();
        Double year17 = orderService.getYear17Total();
        Double year18 = orderService.getYear18Total();
        Double year19 = orderService.getYear19Total();

        List<Double> slist = new ArrayList<>();
        slist.add(year16);
        slist.add(year17);
        slist.add(year18);
        slist.add(year19);

        Map<String,List> map = new HashMap<>();
        map.put("xlist",xlist);
        map.put("slist",slist);
        return map;
    }
}
