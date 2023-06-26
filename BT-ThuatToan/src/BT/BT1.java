package BT;

import java.util.ArrayList;
import java.util.List;


public class BT1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() *100));
        }
        System.out.println(list);
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("Giá tr lớn nhất trong mảng là: "+ max);
    }
}