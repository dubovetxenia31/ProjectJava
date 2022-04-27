package Lesson12.HomeWork;

import java.util.*;

public class ICollections implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
//        if ((a == null))
//            throw new NullPointerException("a==null");
//        if ((b == null))
//            throw new NullPointerException("b==null");

        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new LinkedList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Collection<Integer> result = new LinkedList<>();
        result.addAll(a);
        for (Integer num : b) {
            if (!a.contains(num))
                result.add(num);
        }
        return result;
    }

    @Override
    public Collection<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        a.retainAll(b);

        return  a;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        Collection<Integer> result = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                result.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                result.add(num);
            }
        }
        return result;


//        Set<Integer> sd = new HashSet<>(a);
//        sd.addAll(b);
//        Set<Integer> tmp = new HashSet<>(a);
//        tmp.retainAll(b);
//        sd.removeAll(tmp);
//
//        return sd;
    }
}
