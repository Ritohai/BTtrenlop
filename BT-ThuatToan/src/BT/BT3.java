package BT;

public class BT3 {
    public static void main(String[] args) {
        int[][] list = new int[5][5];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = (int) (Math.random() * 50);
                System.out.print(list[i][j] + "  ");
            }
            System.out.println(); // Câu lệch để xuống dòng
        }
        boolean check = false;
        int number = 23;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(number == list[i][j]) {
                    check = true;
                    break;
                }
            }
            if(check) {
                break;
            }
        }
        System.out.println(check);
    }
}
