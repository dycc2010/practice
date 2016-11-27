package Guava.ListTest;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by zz on 2016/10/31.
 */
public class ListTest {
    public static void main(String[] args) {
        ImmutableSortedSet<String> of = ImmutableSortedSet.of("a", "b", "c", "a", "d", "b");
        System.out.println(of);
        ImmutableSet<String> foobar = ImmutableSet.of("foo", "bar", "baz");
        thingamajig(foobar);
        ImmutableList<String> strings = ImmutableSet.of("foo", "bar", "baz").asList();
        String s = strings.get(2);
        System.out.println(s);
        double d=0.65*10;
        System.out.println(d);

        List<String> names = Lists.newArrayList("John", "Jane", "Adam", "Tom");
        Collection<String> a = Collections2.filter(names, Predicates.containsPattern("a"));
        System.out.println(a);
        Iterable<String> result = Iterables.filter(names, Predicates.containsPattern("a"));
        System.out.println(result);
        Predicate<Object> aNull = Predicates.isNull();
        System.out.println(aNull);

        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 5, 6, 7, 9, 0);
        Collection<Integer> filter = Collections2.filter(integers, new Predicate<Integer>() {
            public boolean apply(Integer input) {
                if (input > 4) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        System.out.println(filter);
        Collection<String> transform = Collections2.transform(integers, new Function<Integer, String>() {
            public String apply(Integer input) {
                return input + "test";
            }
        });
        System.out.println(transform);

    }
    static void thingamajig(Collection<String> collection) {
        ImmutableList<String> defensiveCopy = ImmutableList.copyOf(collection);
        System.out.println(defensiveCopy);
    }

}
