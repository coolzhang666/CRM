package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.SaleChance;
import cn.edu.cqut.crm.service.SaleChanceService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SaleChanceController {
    @Autowired
    private SaleChanceService saleChanceService;

    @RequestMapping(value = "/SaleChance/addSaleChance",method =RequestMethod.POST)
    public Map<String, String> addSaleChance(SaleChance saleChance){
        saleChanceService.addSaleChance(saleChance);
        Map<String, String> map = new HashMap<String,String>();
        map.put("result", "新增销售机会成功");
        return map;
    }
//    @InitBinder
//    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }

    /**
     * 销售机会分页查询功能
     * @param page 当前页号
     * @param rows 页面容量
     * @return 返回销售机会列表
     */
    @RequestMapping(value = "/saleChance/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getAllSaleChance(@PathVariable() int page, @PathVariable() int rows) {
        PageHelper.startPage(page, rows);
        List<SaleChance> saleChances = saleChanceService.getAllSaleChance();
        PageInfo<SaleChance> pageInfo = new PageInfo<>(saleChances);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", saleChances, total);
    }

    @RequestMapping(value = "/SaleChance/{chanceId}",method = RequestMethod.DELETE)
    public Map<String, String> removeSaleChance(@PathVariable() Integer chanceId) {
//        System.out.println(chanceId);
        saleChanceService.removeSaleChance(chanceId);
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "删除客户成功");
        //System.out.println("aaaa");
        return map;
    }

    @RequestMapping(value = "/SaleChance",method = RequestMethod.PUT)
    public void changeSaleChance(SaleChance saleChance){
        saleChanceService.changeSaleChance(saleChance);
    }

    @RequestMapping(value = "/SaleChance/addSendPerson",method = RequestMethod.PUT)
    public ReturnObject<Object> addSendPerson(SaleChance saleChance){
        System.out.println(saleChance.getChanceStatus());
        saleChanceService.addSendPerson(saleChance);
        return ReturnUtil.success("指派成功", null);

    }

}
