import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 연속된 비교 연산X
        // 문자열 길이는 length()
        
        if(1<= a.length() && a.length() <= 1000000) {
            System.out.println(a);
        }
    
    }
}