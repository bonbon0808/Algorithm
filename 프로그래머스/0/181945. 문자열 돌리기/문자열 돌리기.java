import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      
        if(1 <= str.length() && str.length() <= 10) {
            for(int i = 0; i < str.length(); i++){
                char result = str.charAt(i);
                System.out.println(result);
            }
        }
    }
}