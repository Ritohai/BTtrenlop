package BT8;

import java.util.*;

public class XoaTrungLap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,2,5,3,6,2,8);
        Set<Integer> set = new HashSet<Integer>(list);
        System.out.println(set);
    }
}
