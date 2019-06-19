package com.debug.mooc.dubbo.one.enums;

public enum StatusCode {
   SUCCESS(0,"成功"),
    FAIL(-1,"请求失败"),
    INVALID_PRARMS(200,"无效的请求参数！");

   private StatusCode(Integer code, String msg){
       this.code = code;
       this.msg = msg;
   }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
