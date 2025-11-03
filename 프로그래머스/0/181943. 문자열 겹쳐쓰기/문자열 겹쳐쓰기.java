class Solution {
    public String solution(String my_string, String overwrite_string, int s) { 
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(s==i){
                for(int j=0; j<overwrite_string.length(); j++){
                    answer+=overwrite_string.charAt(j);
                    i++;
                }
            }
            if(i<my_string.length()){
                answer+=my_string.charAt(i);                
            }
        }
        return answer;
    }
}