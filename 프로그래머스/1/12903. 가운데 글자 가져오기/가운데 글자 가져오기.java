class Solution {
    public String solution(String s) {
        String answer = "";
        int idx=0;
        for(int i=0; i<s.length(); i++){
            if(s.length()%2==0){
                idx=s.length()/2;
            } else {
                idx=s.length()/2+1;

            }
        }
        if(s.length()%2==0){
            answer+=s.charAt(idx-1);
            answer+=s.charAt(idx);
        } else {
            answer+=s.charAt(idx-1);
        }
        return answer;
    }
}