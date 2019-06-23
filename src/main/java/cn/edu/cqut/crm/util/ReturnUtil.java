package cn.edu.cqut.crm.util;

public final class ReturnUtil {
    private final static int SUCCESS_CODE = 1;
    private final static String SUCCESS_MSG = "SUCCESS";
    private final static int FAIL_CODE = 0;
    private final static String FAIL_MSG = "FAIL";
    private final static int ERROR_CODE = -1;
    private final static String ERROR_MSG = "ERROR";

    public static ReturnObject<Object> success() {
        return success(null);
    }

    public static ReturnObject<Object> success(Object o) {
        return success(null, o);
    }

    public static ReturnObject<Object> success(String msg, Object o) {
        return success(msg, o, null);
    }

    public static ReturnObject<Object> success(String msg, Object o, Object additionContent) {
        ReturnObject<Object> object = new ReturnObject<>();
        object.setStatus(SUCCESS_CODE);
        object.setMsg(msg == null ? SUCCESS_MSG : msg);
        object.setData(o);
        object.setAdditionContent(additionContent);
        return object;
    }

    public static ReturnObject<Object> fail() {
        return fail(null);
    }

    public static ReturnObject<Object> fail(Object o) {
        return fail(null, o);
    }

    public static ReturnObject<Object> fail(String msg, Object o) {
        return fail(msg, o, null);
    }

    public static ReturnObject<Object> fail(String msg, Object o, Object additionContent) {
        ReturnObject<Object> object = new ReturnObject<>();
        object.setStatus(FAIL_CODE);
        object.setMsg(msg == null ? FAIL_MSG : msg);
        object.setData(o);
        object.setAdditionContent(additionContent);
        return object;
    }

    public static ReturnObject<Object> error() {
        return error(null);
    }

    public static ReturnObject<Object> error(Object o) {
        return error(null, o);
    }

    public static ReturnObject<Object> error(String msg, Object o) {
        ReturnObject<Object> object = new ReturnObject<>();
        object.setStatus(ERROR_CODE);
        object.setMsg(msg == null ? ERROR_MSG : msg);
        object.setData(o);
        return object;
    }
}
