class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bigger=m;
        if(n>m){
            bigger=n;
        }
        for(int i=1; i<=bigger; i++){
            if(n%i==0&&m%i==0){
                answer[0]=i;
            }
        }
        for(int i=n; i<=1000000; i=i+n){
            if(i%n==0&&i%m==0){
                answer[1]=i;
                break;
            }
        }
        return answer;
    }
}