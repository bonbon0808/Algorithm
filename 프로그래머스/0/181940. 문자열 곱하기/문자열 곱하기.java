class Solution {
    public String solution(String my_string, int k) {
       // repeat()
        // return my_string.repeat(k);
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < k ; i++) {
            str.append(my_string);
        }
        return str.toString();
    }
}