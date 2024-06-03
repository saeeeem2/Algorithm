
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str_num="";
        for(int num=i; num<=j; num++){
            str_num+=num+"";
        }
        for(int n=0; n<str_num.length(); n++){
            if(str_num.charAt(n)-48==k){
                answer++;
            }
        }
        return answer;
    }
}