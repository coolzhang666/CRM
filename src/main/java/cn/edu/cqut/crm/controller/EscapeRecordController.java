package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.EscapeRecord;
import cn.edu.cqut.crm.model.LoseCount;
import cn.edu.cqut.crm.service.EscapeRecordService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EscapeRecordController {
    @Autowired
    private EscapeRecordService escapeRecordService;

    @RequestMapping(value = "/escapeRecord", method = RequestMethod.PUT)
    public ReturnObject<Object> addEscapeRecord(EscapeRecord escapeRecord) {
        System.out.println(escapeRecord);
        Integer result = escapeRecordService.addEscapeRecord(escapeRecord);
        if (result == 1) {
            return ReturnUtil.success("操作成功", null);
        } else if (result == -1){
            return ReturnUtil.fail("操作失败，您还未进行任何暂缓措施", null);
        } else {
            return ReturnUtil.fail("操作失败", null);
        }
    }

    @RequestMapping(value = "/escapeRecord/customerId/{custormer}",method = RequestMethod.GET)
    public ReturnObject<Object> listAsCustormId(@PathVariable() Integer custormerId){
        return ReturnUtil.success(escapeRecordService.listAsCustomerId(custormerId));
    }

    @RequestMapping(value = "/escapeRecord/creatorId/{creatorId}",method = RequestMethod.GET)
    public ReturnObject<Object> listAsCratorId(@PathVariable() Integer creatorId){
        return ReturnUtil.success(escapeRecordService.listAsCreatorId(creatorId));
    }

    @RequestMapping(value = "/escapeRecord/escapeReason",method = RequestMethod.GET)
    public ReturnObject<Object> listAsEscapeReason(){
        Map<String,List> map = new HashMap();
        List<LoseCount> list =escapeRecordService.countAsEscapeReason();
        List xlist = new ArrayList<>();
        List slist = new ArrayList<>();
        for(LoseCount loseCount:list){
            xlist.add(loseCount.getType());
            slist.add(loseCount.getTotalNum());
        }
        map.put("xlist",xlist);
        map.put("slist",slist);
        return ReturnUtil.success(map);
    }
}
