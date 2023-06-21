package BT10;


import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            int number = (int) (Math.random() * 10);
//            list.add(number);
//        }
        List<Integer> list = Arrays.asList(3,2,5,6,2,3);
        System.out.println(list);
        int sum = 0;
        for (int numbers : list) {
            sum += numbers;
        }
        System.out.println(sum);
    }

}
