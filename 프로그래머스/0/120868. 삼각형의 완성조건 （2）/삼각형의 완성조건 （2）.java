class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longer=0;
        int shorter=0;
        if(sides[0]>sides[1]){
            longer=sides[0];
            shorter=sides[1];
        } else {
            longer=sides[1];
            shorter=sides[0];
        }
        for(int i=1; i<sides[0]+sides[1]; i++){
            if(i<sides[0]+sides[1] && i>longer){
                answer++;
            } else if(longer>i && longer<=i+shorter){
                answer++;
            } else if(longer==shorter && i==longer){
                answer++;
            }
        }
        return answer;
    }
}