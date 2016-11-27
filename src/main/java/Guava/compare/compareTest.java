package Guava.compare;

import com.google.common.collect.ComparisonChain;
import org.apache.commons.collections.comparators.ComparatorChain;

/**
 * Created by zz on 2016/11/23.
 */
public class compareTest {

    public static void main(String[] args) {
        int result = ComparisonChain.start().compare(1,1).compare(1,2).result();
        System.out.println(result);
    }


}
