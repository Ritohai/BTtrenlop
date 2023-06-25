package bt.bt9;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortDownTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(1, "Huy");
        treeMap.put(5, "Hai");
        treeMap.put(3, "Binh");
        treeMap.put(2, "Duy");
        treeMap.put(4, "Hoang");


        System.out.println("TreeMap ban đầu:");
        getTreeMap(treeMap);


        TreeMap<Integer, String> sortMap = new TreeMap<>(Comparator.reverseOrder());
        sortMap.putAll(treeMap);


        System.out.println("TreeMap đã sắp xếp theo giá trị giảm dần:");
        getTreeMap(sortMap);
    }

    private static void getTreeMap(TreeMap<Integer, String> treeMap) {
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
