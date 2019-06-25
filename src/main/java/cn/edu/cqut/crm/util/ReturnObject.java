package cn.edu.cqut.crm.util;

import com.alibaba.fastjson.JSON;

/**
 * 返回消息类
 * @param <T> 数据类型
 */
public class ReturnObject<T extends Object> {
    private Integer status;
    private String msg;
    private T data;
    private Long total;
    private Object additionContent;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getAdditionContent() {
        return additionContent;
    }

    public void setAdditionContent(Object additionContent) {
        this.additionContent = additionContent;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


}
