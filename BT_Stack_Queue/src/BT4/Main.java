package BT4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str1 = "racellcar";
//        String str2 = "olalo";
    if(isPalindrome(str1)){
        System.out.println(str1+ "là chuỗi palindrome.");
    } else System.out.println(str1+ " không là chuỗi palindrome.");
//        System.out.println(str1 + " là chuỗi palindrome: " + PalindromeChecker.isPalindrome(str1));
    }
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Thêm ký tự vào Queue và Stack
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            queue.add(c);
            stack.push(c);
        }
        // So sánh từng cặp ký tự từ Queue và Stack
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char queueChar = queue.remove();
            char stackChar = stack.pop();
            if (queueChar != stackChar) {
                System.out.println();
                return false; // Không phải là chuỗi palindrome
            }
        }
        return true; // Là chuỗi palindrome
    }
}
