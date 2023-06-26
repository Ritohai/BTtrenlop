package BTTH.BT1;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int value) {
        int low = 0;
        int high = list.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (list[mid] == value) {
                return mid;
            } else if (list[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
