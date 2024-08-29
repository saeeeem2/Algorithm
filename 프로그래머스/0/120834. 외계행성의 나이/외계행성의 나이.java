class Solution {
    public String solution(int age) {
        String answer = "";
        String str=age+"";
        String[] num=str.split("");
        for(int i=0; i<num.length; i++){
            answer+=(char)(Integer.parseInt(num[i])+97);
        }
        return answer;
    }
}