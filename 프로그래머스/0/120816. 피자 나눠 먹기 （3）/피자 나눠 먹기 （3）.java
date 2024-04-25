class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int pizza=slice;
        while(true){
            if(pizza/n<1){
                answer++;
                pizza+=slice;
            } else {
                break;
            }
        }
        return answer;
    }
}