import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx=people.length-1;
        int i=0;
        while(i <= idx){
            if(people[i]+people[idx]<=limit){
                i++;
            }
            idx--;
            answer++;
        }
        return answer;
    }
}