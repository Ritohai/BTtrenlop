package BT2;

import java.util.ArrayList;
import java.util.List;

public class DaoNguoc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int number = (int) (Math.random() *20);
            list.add(number);
        }
        System.out.println(list);
        for (int i = list.size()-1; i >= 0 ; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
