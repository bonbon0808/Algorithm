class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[1];
        int num1 = num_list.length - 1;
        int num2 = num_list.length - 2;
    
    for(int i = 0; i < num_list.length; i++) {
        if(num_list[num1] > num_list[num2]){
            answer[0] = (num_list[num1]) - (num_list[num2]);
        } else {
            answer[0] = num_list[num1] * 2;
        }
    }
        
        int[] result = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, result, 0, num_list.length);
        result[num_list.length] = answer[0];
        
        return result;
    }
}