class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<arr.length; j++){
                if(queries[i][0]<=j && queries[i][1]>=j){
                    answer[j]=answer[j]+1;
                } 
            }
        }
        return answer;
    }
}