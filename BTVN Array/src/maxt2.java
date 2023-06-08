import java.util.Arrays;

public class maxt2 {

    public static void main(String[] args) {
        int[] mang = {10, 5, 7, 2, 9};
        int phanTuLonNhat = Integer.MIN_VALUE;
        int phanTuLonThuHai = Integer.MIN_VALUE;

        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > phanTuLonNhat) {
                phanTuLonThuHai = phanTuLonNhat;
                phanTuLonNhat = mang[i];
            } else if (mang[i] > phanTuLonThuHai && mang[i] < phanTuLonNhat) {
                phanTuLonThuHai = mang[i];
            }
        }

        System.out.println("Phần tử lớn thứ hai trong mảng là: " + phanTuLonThuHai);
    }
}

