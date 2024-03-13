import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String change = "";
       
    
        if(1<= str.length() && str.length() <= 20) {
             for(int i = 0; i < str.length(); i++) {
                  char alphabet = str.charAt(i);
                 if(65 <= alphabet && alphabet <= 90){
                     change += (char) (alphabet + 32);
                 } else if (97 <= alphabet && alphabet <= 122){
                     change += (char) (alphabet - 32);
                 }
             }
            System.out.println(change);
        }
    }
}

// 대문자 65부터 90 (32 더하면 소문자)
// 소문자 97부터 122 (32 빼면 대문자)
