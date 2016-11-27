package Guava.check;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by zz on 2016/11/23.
 */
public class CheckTest {
    public static void main(String[] args) {
        checkArgument(true);
        //checkArgument(false);//IllegalArgumentException

        String a = checkNotNull("a");
        System.out.println(a);
        //checkNotNull(null);//NullPointerException

    }
}
