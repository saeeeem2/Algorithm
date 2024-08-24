class Solution {
    public int[] solution(int l, int r) {
        int cnt=0;
        int idx=0;
        for(int i=l; i<=r; i++){
            cnt++;
            int num = i;
            while(num!=0){
                if(num%10==0 || num%10==5){
                    num/=10;
                }else{
                    cnt--;
                    break;
                }
            }
        }
        int[] answer = new int[cnt];
        if(cnt==0){
            answer=new int[] {-1};
            return answer;
        }
        for(int i=l; i<=r; i++){
            answer[idx] = i;
            idx++;
            int num = i;
            while(num!=0){
                if(num%10==0 || num%10==5){
                    num/=10;
                }else{
                    idx--;
                    break;
                }
            }
            if(idx==cnt){
                break;
            }
        }
        return answer;
    }
}