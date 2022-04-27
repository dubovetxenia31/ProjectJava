package Lesson13.HomeWork;


import java.util.*;

public class Main {
    public static void main(String[] args) {

    String as = "123";
    String as1 = "123";

    List<String>str = Arrays.asList(as,as1);
        System.out.println(str);

        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o2, Integer o1) {
                return o2 - o1;
            }
        });
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);

    }
}
