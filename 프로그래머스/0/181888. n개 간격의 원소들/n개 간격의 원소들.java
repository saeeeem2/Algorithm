class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = num_list.length%n==0 ? new int[num_list.length/n] : new int[num_list.length/n+1];
        int idx=0;
        for(int i=0; i<num_list.length; i=i+n){
            answer[idx]=num_list[i];
            idx++;
        }
        return answer;
    }
}