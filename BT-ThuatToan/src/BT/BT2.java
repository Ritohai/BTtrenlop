package BT;

import java.util.ArrayList;
import java.util.List;

public class BT2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() *50));
        }
        System.out.println(list);
        int min = list.get(0);
        int min2 = list.get(1);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) {
                min2 = min;
                min = list.get(i);
            } else if (min < list.get(i) && min2 > list.get(i)) {
                min2 = list.get(i);
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
        System.out.println("Giá trị nhỏ thứ 2 là: " + min2);
    }
}
