import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();
        int idx=0;
        for(int i=0; i<score.length; i++){
            if(scoreList.size()<k){
                scoreList.add(score[i]);
                answer[idx]=Collections.min(scoreList);
                idx++;
            } else {
                Collections.sort(scoreList);
                if(scoreList.get(0)<score[i]){
                    scoreList.remove(0);
                    scoreList.add(score[i]);
                    Collections.sort(scoreList);
                    answer[idx]=scoreList.get(0);
                    idx++;
                } else {
                    answer[idx]=scoreList.get(0);
                    idx++;
                }
            }
        }
        return answer;
    }
}