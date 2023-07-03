package BTTH;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BT_01 {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        BT_01 mainObj = new BT_01();
        mainObj.readFileText(path);
    }

    public void readFileText(String filePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (FileNotFoundException e) {
            // TH file không tồn tại thì sẽ hiển thị thông báo lỗi.
            System.err.println("File không tồn tại!");
        } catch (IOException e) {
            // TH có lỗi khi đọc file, sẽ hiển thị thông báo lỗi.
            System.err.println("Lỗi khi đọc file!");
        } catch (NumberFormatException e) {
            // TH nội dung file không phải là số nguyên, sẽ hiển thị thông báo lỗi.
            System.err.println("Nội dung file không phải là số nguyên!");
        }
    }
}
