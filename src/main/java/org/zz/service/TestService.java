package org.zz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zz.enums.TestEnum;
import org.zz.mappers.TestMapper;
import org.zz.pojo.TestPojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by zz on 2016/11/20.
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;
    @Transactional
    public void testUpdate(int id,BigDecimal amount) {
        // 转出
        testMapper.updateTest(id,amount);

        // 添加异常
        int d = 1 / 0;
       // throw new RuntimeException("注释");
        // 转入
        testMapper.updateTest(1,new BigDecimal(1100.32));
    }

    @Transactional
    public void testInsert(TestPojo testPojo) {
//        TestPojo testPojo=new TestPojo();
//        testPojo.setName("zz");
//        testPojo.setTestEnum(TestEnum.fail);
//        testPojo.setDoubleMoney(12.01);
//        testPojo.setFlag(false);
//        testPojo.setCreateTime(new Date());
//        testPojo.setAge(11);
//        testPojo.setAmount(new BigDecimal(12.123));
       testMapper.insertTest(testPojo);

    }

    @Transactional
    public void testInsertList(List<TestPojo> list) {
        for (TestPojo testPojo:list){
            testMapper.insertTest(testPojo);
            if (testPojo.getAge()==19){
                int d = 1 / 0;
            }
        }
    }
}
