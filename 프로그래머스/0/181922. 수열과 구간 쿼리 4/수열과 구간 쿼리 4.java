class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<queries.length; j++){
                if(i%queries[j][2]==0 && i>=queries[j][0] && i<=queries[j][1]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}