import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String str=my_string.replaceAll("[^0-9]","");
        String[] str_list=str.split("");
        int[] answer=new int[str_list.length];
        
        for(int i=0; i<str_list.length; i++){
            answer[i]=Integer.parseInt(str_list[i]);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}