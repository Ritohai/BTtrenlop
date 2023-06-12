package RA;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "Student";

    Student(int r, String n){
        rollNo = r;
        name = n;
    }
    static  void change(){
        college="Rikkei";
    }
    void play(){
        System.out.println(" " + rollNo + "| "+ name + "| "+ college);
    }
//    public String toString(){
//        return " " + rollNo + "| "+ name + "| "+ college;
//    }
}
