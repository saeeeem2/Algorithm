class Solution {
    public String solution(String s) {
        String answer = "";
        String str=s.toLowerCase();
        String[] s_list=str.split("");
        for(int i=0; i<s_list.length; i++){
            if(i==0 || s_list[i-1].equals(" ")){
                answer+=s_list[i].toUpperCase();
            } else {
                answer+=s_list[i];
            }
        }
        return answer;
    }
}