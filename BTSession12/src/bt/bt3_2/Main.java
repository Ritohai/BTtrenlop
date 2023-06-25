package bt.bt3_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Huy");
        map.put(5, "Binh");
        map.put(2, "Hai");
        map.put(4, "Hoang");
        map.put(3, "Duy");
        System.out.println("Trước khi sắp xếp: " + map);
        Map<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println("Sau khi sắp xếp: " + treeMap);
    }
}
