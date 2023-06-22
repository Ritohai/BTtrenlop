
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi mới: ");
        String str = new Scanner(System.in).nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count+1);
            }
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            Character c = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("Key: " + c + " Value: " + count);
        }


    }
}