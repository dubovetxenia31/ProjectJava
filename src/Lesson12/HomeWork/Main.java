package Lesson12.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        if ((a == null))
            throw new NullPointerException("a==null");
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        ArrayList<Integer> b = new ArrayList<>();
        if ((b == null))
            throw new NullPointerException("b==null");
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);

        ICollections iCollect = new ICollections();
//        Collection arrayList = iCollect111.union(a,b);
        System.out.println( iCollect.union(a,b));
        System.out.println("---------------------------------------------");


        ArrayList<Integer> a1 = new ArrayList<>();
        if ((a == null))
            throw new NullPointerException("a==null");
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);

        ArrayList<Integer> b1 = new ArrayList<>();
        if ((b1 == null))
            throw new NullPointerException("b==null");
        b1.add(1);
        b1.add(2);
        b1.add(3);
        b1.add(9);
        b1.add(10);

        ICollections iCollect1 = new ICollections();
//        Collection arrayList = iCollect111.union(a,b);
        System.out.println( iCollect1.intersection(a1,b1));
        System.out.println("---------------------------------------------");

        ArrayList<Integer> a2 = new ArrayList<>();
        if ((a2 == null))
            throw new NullPointerException("a==null");
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        a2.add(5);

        ArrayList<Integer> b2 = new ArrayList<>();
        if ((b2 == null))
            throw new NullPointerException("b==null");
        b2.add(6);
        b2.add(7);
        b2.add(3);
        b2.add(9);
        b2.add(11);

        ICollections iCollect2 = new ICollections();
//        Collection arrayList = iCollect111.union(a,b);
        System.out.println( iCollect2.intersectionWithoutDuplicate(a,b));
        System.out.println("---------------------------------------------");

        ArrayList<Integer> a3 = new ArrayList<>();
        if ((a3 == null))
            throw new NullPointerException("a==null");
        a3.add(1);
        a3.add(2);
        a3.add(3);
        a3.add(4);
        a3.add(5);

        ArrayList<Integer> b3 = new ArrayList<>();
        if ((b3 == null))
            throw new NullPointerException("b==null");
        b3.add(6);
        b3.add(7);
        b3.add(4);
        b3.add(5);
        b3.add(10);

        ICollections iCollect3 = new ICollections();
//        Collection arrayList = iCollect111.union(a,b);
        System.out.println( iCollect3.difference(a,b));
        System.out.println("---------------------------------------------");
    }


}
