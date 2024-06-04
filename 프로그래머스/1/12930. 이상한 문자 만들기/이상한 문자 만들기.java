class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_list=s.split("");
        int idx=0;
        for(int i=0; i<s_list.length; i++){
            if(s_list[i].equals(" ")){
                idx=-1;
            }
            if(idx%2==0){
                answer+=s_list[i].toUpperCase();
            } else {
                answer+=s_list[i].toLowerCase();
            }
            idx++;
        }
        return answer;
    }
}