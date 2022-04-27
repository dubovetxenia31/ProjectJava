package Lesson14HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterExe {
    public static void main(String[] args) {

        String ss = "MADAM";
        String s = "11411";
        String s1 = "А роза упала на лапу азора";
        char[] chars = s.toCharArray();

        List<Character> characters = new ArrayList<>();
        boolean isPolindrom = true;

        for (char c : chars) {
            characters.add(c);
        }
        ListIterator<Character> iter = characters.listIterator();
        ListIterator<Character> revers = characters.listIterator(characters.size());

        while (iter.hasNext() && revers.hasPrevious()) {
            if(!iter.next().equals(revers.previous())){
                isPolindrom=false;
                break;
            }
        }
        if(isPolindrom) System.out.println("Это Полиндром");
        else System.out.println("Это не Полиндром");
    }
}
