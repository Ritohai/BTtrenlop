package BT5;

import java.util.ArrayList;
import java.util.List;

public class Chuoingannhat {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");
        objects.add("World");
        objects.add("Java");
        objects.add("Programming");

        String shortestString = findShortestString(objects);
        System.out.println("Chuỗi ngắn nhất: " + shortestString);
    }

    private static String findShortestString(List<Object> objects) {
        String shortestString = null;
        int shortestLength = Integer.MAX_VALUE;

        for (Object obj : objects) {
            if (obj instanceof String) {
                String str = (String) obj;
                int length = str.length();

                if (length < shortestLength) {
                    shortestString = str;
                    shortestLength = length;
                }
            }
        }

        return shortestString;
    }
}
