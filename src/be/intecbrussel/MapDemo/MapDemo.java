package be.intecbrussel.MapDemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        List<String> sentences = new ArrayList<>();
        sentences.add("Today is monday");
        sentences.add("Tomorrow is tuesday");
        sentences.add("Yesterday was sunday");

//        System.out.println(sentences.get(0));


        Map <String, String> dayMap = new LinkedHashMap<>();
        dayMap.put("today", "Today is monday");
        dayMap.put("tomorrow", "Tomorrow is tuesday");
        dayMap.put("yesterday", "Yesterday was sunday");

        System.out.println(dayMap.get("today"));
        /*
        KEY = VALUE
        */
    }
}
