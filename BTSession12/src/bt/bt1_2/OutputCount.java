package bt.bt1_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutputCount {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Huy");
        list.add("Duy");
        list.add("Hai");
        list.add("Hoang");
        list.add("Binh");
        list.add("Hai");
        list.add("Hai");
        list.add("Hai");
        list.add("Hai");

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i),1);
            }else {
                int count = map.get(list.get(i));
                map.put(list.get(i),count+1);
            }
        }
        Map<String,Integer> map1= new HashMap<String,Integer>();

        for(String name:map.keySet()) {
            if(map.get(name) == 1 ){
                map1.put(name,1);
            }
        }
        System.out.println(map1);
    }
}
