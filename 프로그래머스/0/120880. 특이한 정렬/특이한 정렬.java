class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] num = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
           int result=(n-numlist[i])*2;
            if(result<0){
             num[i]=-1*result-1;
            }else{
             num[i]=result;
            }
        }
        for(int i=0; i<num.length; i++){
            int idx=0;
            for(int j=0; j<num.length; j++){
                if(num[i]>num[j]){
                    idx++;
                }
            }
            answer[idx]=numlist[i];
        }
        return answer;
    }
}