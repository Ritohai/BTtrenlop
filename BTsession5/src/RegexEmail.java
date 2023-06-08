import java.util.Scanner;

public class RegexEmail {
    //Viết một chương trình Java để kiểm tra xem một chuỗi có phải là một địa chỉ email hợp lệ hay không,
    // sử dụng regex. Một địa chỉ email hợp lệ có thể có dạng "username@OrganizationName. area symbol".
    // Vd: rikeiacademy@rikkeisoft.com
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập địa chỉ Email: ");
        String emailAdress = scanner.nextLine();
        System.out.println("Email check : " + check(emailAdress));
    }
    public static boolean check(String email) {
        String regex = "^[a-zA-Z0-9+-._]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }
}
