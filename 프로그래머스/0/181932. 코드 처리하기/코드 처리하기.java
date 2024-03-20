class Solution {
    public String solution(String code) {
        
        int mode = 0;
        String ret = "";
        
      
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '1' && mode == 0) {
                mode = 1;
            } else if(code.charAt(i) == '1' && mode == 1) {
                mode = 0;
            }
            
            if(mode == 0 && code.charAt(i) != '1' && i % 2 == 0) {
                ret += code.charAt(i);
            } else if(mode == 1 && code.charAt(i) != '1' && i % 2 == 1) {
                ret += code.charAt(i);
            }   
        }
        
        if(ret.isEmpty()){
                return "EMPTY";
            }
        
         return ret;
          
    }
}
        
        
        
       