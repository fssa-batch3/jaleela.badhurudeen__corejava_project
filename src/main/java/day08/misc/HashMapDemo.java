package day08.misc;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        String[] names = {"Prathiusha", "Prathiusha", "Naresh", "Nihtilan", "Prathiusha"};

        Map<String, Integer> countMap = new HashMap<String, Integer>();

        for (int i = 0; i < names.length; i++) {
            if (countMap.get(names[i]) == null) {
                countMap.put(names[i], 1);
            } else {
                int count = countMap.get(names[i]);
                count++;
                countMap.put(names[i], count);
            }
        }

        System.out.println(countMap);
    }
    
    
}
