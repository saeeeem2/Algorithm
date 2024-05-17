class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String str="[0-9]+";
        if(s.length()==4&&s.matches(str)||s.length()==6&&s.matches(str)){
            return answer;
        } else {
            answer=false;
        }
        return answer;
    }
}