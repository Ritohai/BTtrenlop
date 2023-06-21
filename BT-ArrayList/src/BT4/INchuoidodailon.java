package BT4;

import java.util.ArrayList;
import java.util.List;

public class INchuoidodailon {
    public static void main(String[] args) {
        String str = "Rekkei Academy để nông dân biết code";
        List<String> list = new ArrayList<String>();
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.trim();
            list.add(word);
        }
        List<String> list2 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 3) {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);

    }
}
