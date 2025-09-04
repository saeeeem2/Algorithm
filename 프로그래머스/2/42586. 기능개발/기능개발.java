import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] pgrList = new int[n];
        for (int i = 0; i < n; i++) {
            pgrList[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]); 
        }
        List<Integer> result = new ArrayList<>();
        int max = pgrList[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (pgrList[i] <= max) {
                count++;
            } else {
                result.add(count);
                max = pgrList[i];
                count = 1;
            }
        }
        result.add(count); 
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}