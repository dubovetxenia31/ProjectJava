package Lesson14HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExe {
    public static void main(String[] args) {



        Map<String,Double> nameAndMany = new HashMap<>(16,0.75f);

        nameAndMany.put("Джон Доу", 3443.5);
        nameAndMany.put("Toм Смит", 123.22);
        nameAndMany.put("Джейн Бейкер", 1378.00);
        nameAndMany.put("Тод Холл", 99.22);
        nameAndMany.put("Ральф Смит", -19.98);
        nameAndMany.put(null,22.33);

        for(Map.Entry<String,Double>m: nameAndMany.entrySet()){
            System.out.print(m.getKey()+" : ");
            System.out.println(m.getValue());
        }


        // System.out.println(nameAndMany);
    }
}

