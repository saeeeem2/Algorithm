class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int x=0;
        
        for(int i=1; i<common.length-1; i++){
            if(common[i]-common[i-1]==common[i+1]-common[i]){
                x=common[i]-common[i-1];
                answer=common[common.length-1]+x;
            }else{
                x=common[i]/common[i-1];
                answer=common[common.length-1]*x;
            }
        }
        return answer;
    }
}