class Solution {
    public int solution(int chicken) {
        int answer = -1;
        if(chicken==0){
            return 0;
        }
        for(int i=0; i<chicken; i=i+9){
            answer++;
        }
        return answer;
    }
}