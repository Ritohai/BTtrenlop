public class BT2 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3696, 854, 44, 95, 154};
        try {
            int max = findMax(array);
            System.out.println(max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMax(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Mảng rỗng");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
