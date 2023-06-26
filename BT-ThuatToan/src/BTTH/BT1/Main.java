package BTTH.BT1;

import static BTTH.BT1.BinarySearch.binarySearch;
import static BTTH.BT1.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,6));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,66));
        System.out.println(binarySearch(list,11));
    }
}
