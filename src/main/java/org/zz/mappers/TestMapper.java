package org.zz.mappers;

import org.apache.ibatis.annotations.Param;
import org.zz.pojo.TestPojo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zz on 2016/11/13.
 */
public interface TestMapper {

    int insertTest(TestPojo testPojo);

    TestPojo selectTest(@Param("id") int id);

    int updateTest(@Param("id") int id,@Param("amount") BigDecimal amount);

}
