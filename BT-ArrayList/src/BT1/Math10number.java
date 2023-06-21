package BT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Math10number {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100);
            list.add(number);
        }
        System.out.println(list);
        System.out.println("Số lớn nhất: "+Collections.max(list));
    }

}
