class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long n=0;
        for(int i=1; i<=count; i++){
            n+=price*i;
            if(n<=money){
              answer=0;  
            } else {
                answer=n-money;
            }
        }
        return answer;
    }
}