public class mindata {
    public static void main(String[] args) {
        int[] mang = {10, 5, 7, 2, 9};
        int giaTriNhoNhat = mang[0]; // Giả sử phần tử đầu tiên là nhỏ nhất

        for (int i = 1; i < mang.length; i++) {
            if (mang[i] < giaTriNhoNhat) {
                giaTriNhoNhat = mang[i]; // Cập nhật giá trị nhỏ nhất nếu tìm thấy phần tử nhỏ hơn
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + giaTriNhoNhat);
    }
}
