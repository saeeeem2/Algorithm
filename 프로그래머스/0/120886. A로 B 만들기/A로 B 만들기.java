import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer=0;
        String[] bef = before.split("");
        String[] aft = after.split("");
        
        Arrays.sort(bef);
        Arrays.sort(aft);
        if(Arrays.equals(bef, aft)){
            answer=1;
        } else {
            answer=0;
        }
        return answer;
    }
}