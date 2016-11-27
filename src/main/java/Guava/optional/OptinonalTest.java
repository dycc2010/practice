package Guava.optional;


import com.google.common.base.Optional;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by zz on 2016/10/31.
 */
public class OptinonalTest {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("a");
        System.out.println(a.isPresent());//true
        Optional<Integer> of = Optional.of(1);
        Integer integer = of.get();
        System.out.println(integer);

        boolean present = Optional.absent().isPresent();
        System.out.println(present);

        Optional<Object> or = Optional.absent().or(Optional.of(5));
        System.out.println(or.get());
        Object o = Optional.absent().orNull();
        System.out.println(o);
        int a1 = Optional.of("a").hashCode();
        System.out.println(a1);
        ArrayList<Integer> integers = Lists.newArrayList(1,1,3,4,5);
        Set<ArrayList<Integer>> arrayLists = Optional.of(integers).asSet();
        System.out.println(arrayLists);
        Set<String> a2 = Optional.of("a").asSet();
        System.out.println(a2);

    }
}
