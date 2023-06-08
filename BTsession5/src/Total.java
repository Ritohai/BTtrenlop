
import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;

public class Total {
    private static List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    private static List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
    private static List<Integer> list3 = new ArrayList<>(Arrays.asList(7, 8, 9));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Hiển thị 3 mảng số nguyên");
            System.out.println("2. Hiển thị mảng được gộp từ 2 mảng số nguyên");
            System.out.println("3. Hiển thị mảng được gộp từ 3 mảng số nguyên");
            System.out.println("4. Chọn một mảng số nguyên để in ra và thực hiện thao tác");
            System.out.println("5. Dừng chương trình");
            System.out.print("Chọn một số từ 1 đến 5: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hienThiBaMangSoNguyen();
                    break;
                case 2:
                    hienThiMangGopHaiMang();
                    break;
                case 3:
                    hienThiMangGopBaMang();
                    break;
                case 4:
                    chonVaInMangSoNguyen();
                    break;
                case 5:
                    System.out.println("Chương trình đã dừng.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void hienThiBaMangSoNguyen() {
        System.out.println("Mảng 1: " + list1);
        System.out.println("Mảng 2: " + list2);
        System.out.println("Mảng 3: " + list3);
    }

    private static void hienThiMangGopHaiMang() {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println("Mảng gộp từ 2 mảng số nguyên: " + mergedList);
    }

    private static void hienThiMangGopBaMang() {
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        mergedList.addAll(list3);
        System.out.println("Mảng gộp từ 3 mảng số nguyên: " + mergedList);
    }

    private static void chonVaInMangSoNguyen() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- Lựa chọn mảng số nguyên -----");
            System.out.println("1. In mảng 1");
            System.out.println("2. In mảng 2");
            System.out.println("3. In mảng 3");
            System.out.println("4. Quay lại menu chính");
            System.out.print("Chọn một số từ 1 đến 4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inMang(list1);
                    thucHienThaoTac(list1);
                    break;
                case 2:
                    inMang(list2);
                    thucHienThaoTac(list2);
                    break;
                case 3:
                    inMang(list3);
                    thucHienThaoTac(list3);
                    break;
                case 4:
                    System.out.println("Quay lại menu chính.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void inMang(List<Integer> list) {
        System.out.println("Mảng số nguyên: " + list);
    }

    private static void thucHienThaoTac(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("----- Thực hiện thao tác -----");
            System.out.println("1. Thêm một phần tử vào cuối mảng");
            System.out.println("2. Thêm một phần tử vào đầu mảng");
            System.out.println("3. Xóa một phần tử ở vị trí đã chọn");
            System.out.println("4. Quay lại lựa chọn mảng");
            System.out.print("Chọn một số từ 1 đến 4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị phần tử muốn thêm vào cuối mảng: ");
                    int element1 = scanner.nextInt();
                    list.add(element1);
                    System.out.println("Mảng sau khi thêm: " + list);
                    break;
                case 2:
                    System.out.print("Nhập giá trị phần tử muốn thêm vào đầu mảng: ");
                    int element2 = scanner.nextInt();
                    list.add(0, element2);
                    System.out.println("Mảng sau khi thêm: " + list);
                    break;
                case 3:
                    System.out.print("Nhập vị trí phần tử muốn xóa (từ 0 đến " + (list.size() - 1) + "): ");
                    int position = scanner.nextInt();
                    if (position >= 0 && position < list.size()) {
                        list.remove(position);
                        System.out.println("Mảng sau khi xóa: " + list);
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.println("Quay lại lựa chọn mảng.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
