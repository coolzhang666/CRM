package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.DelayRecord;
import cn.edu.cqut.crm.service.DelayRecordService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DelayRecordController {
    @Autowired
    private DelayRecordService delayRecordService;

    @RequestMapping(value = "/delayRecord/{customerId}/{page}/{rows}", method = RequestMethod.GET)
    public ReturnObject<Object> getByCustomerId(@PathVariable() Integer customerId, @PathVariable() Integer page, @PathVariable() Integer rows) {
        PageHelper.startPage(page, rows);
        List<DelayRecord> delayRecords = delayRecordService.getByCustomerId(customerId);
        PageInfo<DelayRecord> pageInfo = new PageInfo<>(delayRecords);
        long total = pageInfo.getTotal();
        return ReturnUtil.success("查询成功", delayRecords, total);
    }

    @RequestMapping(value = "/delayRecord", method = RequestMethod.POST)
    public ReturnObject<Object> addDelayRecord(DelayRecord delayRecord) {
        Integer integer = delayRecordService.addDelayRecord(delayRecord);
        return ReturnUtil.success("添加成功", integer);
    }

    @RequestMapping(value = "/delayRecord", method = RequestMethod.PUT)
    public ReturnObject<Object> changeDelayRecord(DelayRecord delayRecord) {
        Integer integer = delayRecordService.changeDelayRecord(delayRecord);
        return ReturnUtil.success("修改成功", integer);
    }

    @RequestMapping(value = "/delayRecord/{delayId}", method = RequestMethod.DELETE)
    public ReturnObject<Object> deleteById(@PathVariable() Integer delayId) {
        Integer integer = delayRecordService.deleteById(delayId);
        return ReturnUtil.success("删除成功", integer);
    }
}
