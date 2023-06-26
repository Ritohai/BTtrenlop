package BT;

import java.util.*;

public class BT13 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi:");
        String str = sc.nextLine();

        List<String> strings = new ArrayList<>(Arrays.asList(str.replaceAll("\\s", "").split("")));

        Set<String> uniqueStrings = new TreeSet<>(strings);
        System.out.println(strings);
        System.out.println(uniqueStrings);
    }
}
