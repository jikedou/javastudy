package _7collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        //可以放入不同类型的对象
        c.add(1);
        c.add(new Integer("121345"));
        c.add("hello");
        System.out.println(c);//[1, 121345, hello]
    }
}
