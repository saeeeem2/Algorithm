import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str); 
        for(String temp : str){
            answer += temp;
        }
        return answer;
    }
}