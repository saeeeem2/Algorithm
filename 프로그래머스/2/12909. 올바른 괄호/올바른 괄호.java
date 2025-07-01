class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                cnt++;
            } else {
                cnt--;
            }
            if(cnt<0){
                answer=false;
            }
        }
        if(cnt==0){
            if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')'){
                return answer;
            } else {
                answer=false;
            }
        }else {
            answer=false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}