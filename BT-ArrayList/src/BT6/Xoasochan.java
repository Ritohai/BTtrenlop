package BT6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xoasochan {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
        List<Integer> number = Arrays.asList(3,2,6,9,8,7,4,22,-3);
        for (int i = 0; i < number.size(); i++) {
            list.add(number.get(i));
        }
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);
    }
}
