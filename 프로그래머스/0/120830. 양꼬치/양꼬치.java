class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        for(int i=0; i<=n; i++){
            if(i/10>=1){
                int s=i/10;
                answer=(12000*n)+(k*2000)-(s*2000);
            } else {
                answer=(12000*n)+(k*2000);
            }
        }
        return answer;
    }
}