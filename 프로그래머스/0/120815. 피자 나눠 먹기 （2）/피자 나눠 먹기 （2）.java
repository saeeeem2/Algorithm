class Solution {
    public int solution(int n) {
        int answer = 0;
        int min=0;
        int gcd=0;
        if(6<=n){
            min=6;
        } else {
            min=n;
        }
        for(int i=1; i<=min; i++){
            if(6%i==0 && n%i==0){
                gcd=i;
            }
        }
        answer=(6*n)/gcd/6;
        return answer;
    }
}