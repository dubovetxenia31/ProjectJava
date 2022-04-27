package Lesson14HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMapExe {
    @SuppressWarnings("DiamondCanBeReplacedWithExplicitTypeArguments")
    public static void main(String[] args) {

        Map<Integer, String> linkedMap = new LinkedHashMap<>(16,0.75f,true);


        linkedMap.put(5,"a");
        linkedMap.put(4,"a");
        linkedMap.put(3,"a");
        linkedMap.put(2,"a");
        linkedMap.put(1,"a");


        System.out.println(linkedMap);
        linkedMap.get(5);
        linkedMap.put(3,"a");
        System.out.println(linkedMap);

    }
}
