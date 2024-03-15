class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();

        for(int i = 0; i < str1.length(); i++){
        answer.append(str1arr[i]).append(str2arr[i]);
        }

        return answer.toString();
    }
}
