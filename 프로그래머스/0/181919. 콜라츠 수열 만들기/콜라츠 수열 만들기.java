class Solution {
    public int[] solution(int n) {
        int cnt=0;
        int idx=1;
        int num=n;
        
        while(num!=1){
            if(num%2==0){
                num=num/2;
                cnt++;
            } else if(num%2!=0){
                num=3*num+1;
                cnt++;
            } else {
                break;
            }
        }
        
        int[] answer = new int[cnt+1];
        answer[0]=n;
        
        while(n!=1){
            if(n%2==0){
                n=n/2;
                answer[idx]=n;
                idx++;
            } else if(n%2!=0){
                n=3*n+1;
                answer[idx]=n;
                idx++;
            } else if(n==1){
                answer[idx]=n;
            }    
        }
        return answer;
    }
}