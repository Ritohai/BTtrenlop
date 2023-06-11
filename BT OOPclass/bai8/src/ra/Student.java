package ra;

// cú pháp khai báo lớp : class + [tên lớp]
public class Student {
    // Khai báo thuộc tính:
    private String name;
    private int age;
    private String msv;

    // hàm khởi tạo (constructor)

    public Student(String name, String msv){
        this.name = name;
        this.msv = msv;
    }
    public Student(String name, int age, String msv) {
        this.name = name;
        this.age = age;
        this.msv = msv;

    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", msv: " + msv;
    }
    //phuowngg thức getter, setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
