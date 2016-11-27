
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zz.enums.TestEnum;
import org.zz.mappers.TestMapper;
import org.zz.pojo.TestPojo;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.zz.service.TestService;

/**
 * Created by zz on 2016/11/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml","classpath:spring/applicationContext-transactional.xml", "classpath:spring/applicationContext-mybatis.xml", "classpath:spring/mybatis-config.xml"})
public class TestYingsShe {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestService testService;


    @Test
    public void testYingShe() {
        TestPojo testPojo1 = new TestPojo();
        testPojo1.setName("zz"+8);
        testPojo1.setTestEnum(TestEnum.lala);
        testPojo1.setDoubleMoney(12.01+8);
        testPojo1.setFlag(true);
        testPojo1.setCreateTime(new Date());
        testPojo1.setAge(11+8);
        testPojo1.setAmount(new BigDecimal(13.123));
        List<TestPojo> list1= Lists.newArrayList(testPojo1);
        testService.testInsertList(list1);
        List<TestPojo> list= Lists.newArrayList();
        for (int i=0;i<=2;i++){
            TestPojo testPojo = new TestPojo();
            testPojo.setName("zz"+i);
            testPojo.setTestEnum(TestEnum.lala);
            testPojo.setDoubleMoney(12.01+i);
            testPojo.setFlag(true);
            testPojo.setCreateTime(new Date());
            testPojo.setAge(11+i);
            testPojo.setAmount(new BigDecimal(12.123));
            list.add(testPojo);
        }
        testService.testInsertList(list);

    }

    @Test
    public void selectYingShe() {
        TestPojo testPojo = testMapper.selectTest(5);
        System.out.println(testPojo.getAge());
        System.out.println(testPojo.getAmount());
        System.out.println(testPojo.getCreateTime());
        System.out.println(testPojo.getDoubleMoney());
        System.out.println(testPojo.getName());
        System.out.println(testPojo.getTestEnum() == TestEnum.lala);
        System.out.println(testPojo.isFlag() == true);
    }

    @Test
    public void updateYingShe() {
        testService.testUpdate(1, new BigDecimal(228.32));
    }
}
