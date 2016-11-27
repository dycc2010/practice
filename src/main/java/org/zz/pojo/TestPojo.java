package org.zz.pojo;

import org.zz.enums.TestEnum;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zz on 2016/11/13.
 */
public class TestPojo {
    private String userName;
    private int age;
    private double doubleMoney;
    //private Long numble;
    private BigDecimal amount;
    private boolean flag;
    private TestEnum testEnum;
    private Date createTime;

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDoubleMoney() {
        return doubleMoney;
    }

    public void setDoubleMoney(double doubleMoney) {
        this.doubleMoney = doubleMoney;
    }

//    public Long getNumble() {
//        return numble;
//    }
//
//    public void setNumble(Long numble) {
//        this.numble = numble;
//    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public TestEnum getTestEnum() {
        return testEnum;
    }

    public void setTestEnum(TestEnum testEnum) {
        this.testEnum = testEnum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
