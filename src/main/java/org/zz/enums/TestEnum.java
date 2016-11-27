package org.zz.enums;

/**
 * Created by zz on 2016/11/13.
 */
public enum TestEnum {

    success(1,"成功"),

    fail(2,"失败"),

    lala(3,"lalalceshi");

    private String msg;
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    TestEnum(Integer value, String msg) {
        this.msg = msg;
        this.value = value;
    }
}
