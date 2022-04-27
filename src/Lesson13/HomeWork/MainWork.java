package Lesson13.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class MainWork implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

        try {
            List<String> stringList = new ArrayList<>();
            stringList.add(String.valueOf(strings));
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
        return asList(strings);

    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(String.valueOf(data));
        return data;
    }
}
