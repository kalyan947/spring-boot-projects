package java8practice;

import java.util.*;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("shiva");
        list.add("Kalyan");
        list.add("venkata");
        list.add("yerva");
        list.add("yerva");
        list.add("yerva");
        list.add("yerva");
        list.add("venkata");
        Map<String,Integer> map=new HashMap<>();
        int count=0;
        list.forEach(s -> {
            if (!map.containsKey(s)) map.put(s, 1);
            else {
                map.put(s, map.get(s) + 1);
            }
        });
        map.forEach((s, integer) -> System.out.println(s+" "+integer));
    }
}
