package BT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sapxep {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random()*20));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
