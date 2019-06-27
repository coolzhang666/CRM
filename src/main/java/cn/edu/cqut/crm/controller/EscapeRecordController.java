package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.EscapeRecord;
import cn.edu.cqut.crm.service.EscapeRecordService;
import cn.edu.cqut.crm.util.ReturnObject;
import cn.edu.cqut.crm.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
