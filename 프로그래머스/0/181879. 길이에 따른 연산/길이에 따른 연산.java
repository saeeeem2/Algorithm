class Solution {
    public int solution(int[] num_list) {
        int answer = num_list.length>=11 ? 0 : 1;
        for(int i=0; i<num_list.length; i++){
            if(num_list.length>=11){
                answer+=num_list[i];
            } else {
                answer*=num_list[i];
            }
        }
        return answer;
    }
}