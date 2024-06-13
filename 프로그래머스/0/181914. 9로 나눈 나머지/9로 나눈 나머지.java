class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] num=number.split("");
        int n=0;
        for(int i=0; i<num.length; i++){
            n+=Integer.parseInt(num[i]);
        }
        answer=n%9;
        return answer;
    }
}