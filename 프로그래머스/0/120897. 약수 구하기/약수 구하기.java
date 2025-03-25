class Solution {
    public int[] solution(int n) {
        int[] answer;
        int cnt=0;
        int idx=0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
            }
        }
        
        answer=new int[cnt];
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[idx]=i;
                idx++;
            }
        }
        
        return answer;
    }
}