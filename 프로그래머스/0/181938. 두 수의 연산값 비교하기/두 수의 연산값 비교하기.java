class Solution {
    public int solution(int a, int b) {

        String ab = String.valueOf(a) + String.valueOf(b);
        String ab2 = String.valueOf(2*a*b);
        
        if(ab.equals(ab2)){
            return Integer.parseInt(ab);
        } else{
        int max = Math.max(Integer.parseInt(ab), Integer.parseInt(ab2));
        return max;
        }
    }
}