package BT7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Addall {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = Arrays.asList(3,2,5,3,6,9);
        list.addAll(list2);
        System.out.println(list);

    }
}
