package _7collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Collection c = new ArrayList<>();
        //可以放入不同类型的对象
        c.add(1);
        c.add(new Integer("121345"));
        c.add("hello");
        System.out.println(c);//[1, 121345, hello]
        System.out.println(c.contains("hello"));
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);

        c2.add(4);
        c2.add(5);
        c2.add(6);

        System.out.println(c1.size());//c1的长度
        System.out.println(c1.contains(2));
        System.out.println(c1.isEmpty());//判断c1是否为空
        c1.remove(2);
        System.out.println(c1);

//        c1.addAll(c2);//将c2添加到c1中
//        System.out.println(c1);
//        c1.contains(c2);
//        System.out.println(c1);
        System.out.println(c1.containsAll(c2));
        c1.remove(c2);
        System.out.println(c1);
        c1.retainAll(c2);//取交集
        System.out.println(c1);
        System.out.println(c1.toArray().toString());


    }
}
