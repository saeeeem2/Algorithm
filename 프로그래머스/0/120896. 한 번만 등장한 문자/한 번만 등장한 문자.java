import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_list=s.split("");
        Arrays.sort(s_list);
        for(int i=0; i<s_list.length; i++){
            int cnt=0;
            for(int j=0; j<s_list.length; j++){
                if(s_list[i].equals(s_list[j])){
                    cnt++;
                }
            }
            if(cnt==1){
                answer+=s_list[i];
            }            
        }
        return answer;
    }
}