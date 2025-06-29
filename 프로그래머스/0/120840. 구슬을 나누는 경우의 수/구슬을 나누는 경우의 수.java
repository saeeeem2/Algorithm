class Solution {
    public int solution(int balls, int share) {
        int answer = 1;
        double n=1;
        double m=1;
        for(int i=balls; i>balls-share; i--){
            n*=i;
        }
        for(int j=share; j>=1; j--){
            m*=j;
        }
        answer=(int)(n/m);
        return answer;
    }
}