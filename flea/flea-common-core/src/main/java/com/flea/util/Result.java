package com.flea.util;


public class Result {

    private Object data;

    private String msg;

    private String success;

    private String fail;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }

    public static Result fail(String string){
        Result result = new Result();
        result.setFail(string);
        return result;
    }

    public Result success(String string){
        Result result = new Result();
        result.setSuccess(string);
        return result;
    }
}
