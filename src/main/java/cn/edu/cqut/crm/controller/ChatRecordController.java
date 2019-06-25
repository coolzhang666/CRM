package cn.edu.cqut.crm.controller;

import cn.edu.cqut.crm.model.ChatRecord;
import cn.edu.cqut.crm.service.ChatRecordService;
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
public class ChatRecordController {

    @Autowired
    private ChatRecordService chatRecordService;

    /**
     *
     * @param page 页码
     * @param rows 当前页显示的行数
     * @return 返回PageHelper处理后的页面
     */
    @RequestMapping(value = "/chatRecord/{page}/{rows}",method = RequestMethod.GET)
    public ReturnObject<Object> listAllChatRecord(@PathVariable() Integer page, @PathVariable() Integer rows) {
        PageHelper.startPage(page, rows);
        List<ChatRecord> list = chatRecordService.getAllChatRecord();
        PageInfo<ChatRecord> pageInfo = new PageInfo<>(list);
        return ReturnUtil.success("查询成功",list,pageInfo.getTotal());
    }


    /**
     *
     * @param page 当前页码
     * @param rows 当前页行数
     * @param cusId 与数据库比对的参数
     * @return
     */
    @RequestMapping(value = "/chatRecord/{page}/{rows}/{cusId}",method = RequestMethod.GET)
    public ReturnObject<Object> getChatRecord(@PathVariable() Integer page,@PathVariable() Integer rows,@PathVariable() Integer cusId){
        PageHelper.startPage(page, rows);
        List<ChatRecord> list = chatRecordService.getChatRecord(cusId);
        PageInfo<ChatRecord> pageInfo = new PageInfo<>(list);
        return ReturnUtil.success("查询成功",list,pageInfo.getTotal());
    }


    /**
     *
     * @param chat_id 根据交往记录的id查表
     * @return 返回操作结果
     */
    @RequestMapping(value = "/chatRecord/{chat_id}",method = RequestMethod.DELETE)
    public ReturnObject<Object> removeChatRecord(@PathVariable() Integer chat_id) {
        chatRecordService.removeChatRecord(chat_id);
        return ReturnUtil.success("删除成功",null);
    }

    /**
     *
     * @param chatRecord 查表所需的参数
     * @return 返回操作结果
     */
    @RequestMapping(value = "/chatRecord",method = RequestMethod.POST)
    public ReturnObject<Object> insertChatRecord(Integer chatRecord) {
        chatRecordService.insertChatRecord(chatRecord);
        return ReturnUtil.success("添加成功");
    }


    /**
     *
     * @param chatRecord 查表所需的参数
     * @return 返回操作结果
     */
    @RequestMapping(value = "/chatRecord",method = RequestMethod.PUT)
    public ReturnObject<Object> updateChatRecord(ChatRecord chatRecord) {
        chatRecordService.updateChatRecord(chatRecord);
        return ReturnUtil.success("修改成功");
    }


}
