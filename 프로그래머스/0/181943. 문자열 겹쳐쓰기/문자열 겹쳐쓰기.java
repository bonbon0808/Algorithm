class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // substring(start) / stbstring(start, end)
        // replace([기존문자],[바꿀문자])
        
        int mylen = my_string.length();
        int overlen = overwrite_string.length();
        
        String result = my_string.substring(0,s) + overwrite_string + my_string.substring(s + overlen, mylen);
        // String result = my_string.replace(replace_string , overwrite_string);
        return result;
    }
}