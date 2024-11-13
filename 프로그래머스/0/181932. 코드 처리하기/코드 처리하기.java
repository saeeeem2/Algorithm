class Solution {
    public String solution(String code) {
        String answer = "";
        int mod=0;
        for(int i=0; i<code.length(); i++){
            if(mod==0){
                if(code.charAt(i)!='1' && i%2==0){
                    answer+=code.charAt(i)+"";
                } else if(code.charAt(i)=='1'){
                    mod=1;
                }
            } else if(mod==1) {
                if(code.charAt(i)!='1' && i%2!=0){
                    answer+=code.charAt(i)+"";
                } else if(code.charAt(i)=='1'){
                    mod=0;
                }
            }
        }
        if(answer.length()==0){
            answer="EMPTY";
        }
        return answer;
    }
}