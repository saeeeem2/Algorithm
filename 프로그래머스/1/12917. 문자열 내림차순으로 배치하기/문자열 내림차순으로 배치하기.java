import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s_list=s.split("");
        Arrays.sort(s_list,Collections.reverseOrder());
        for(String temp : s_list){
            answer+=temp;
        }
        return answer;
    }
}