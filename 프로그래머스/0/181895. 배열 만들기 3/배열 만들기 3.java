class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int cnt=0;
        int idx=0;
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                answer[idx]=arr[j];
                idx++;
            }
        }        
        return answer;
    }
}