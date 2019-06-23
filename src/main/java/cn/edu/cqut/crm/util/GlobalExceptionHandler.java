package cn.edu.cqut.crm.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ReturnObject defaultExceptionHandler(Exception e) {
        return ReturnUtil.error("服务器发生异常，请联系管理员", e.getMessage());
    }
}
