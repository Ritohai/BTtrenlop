package ra;

public class Main {
    public static void main(String[] args) {
        // khởi tạo ddooiss tượng : <class_name> <object_name> = new <class_name>();
        Student student = new Student("Hai", 23, "SV000");
        System.out.println(student);
        Student student1 = new Student("Hai", "SV002");
        System.out.println(student1);
        ClassName class1 = new ClassName();
    // thay đổi thuộc tính name thông qua phương thức setter
        student.setName("a");
        System.out.println(student.getName());
        System.out.println(student1.getMsv());
    }
}
