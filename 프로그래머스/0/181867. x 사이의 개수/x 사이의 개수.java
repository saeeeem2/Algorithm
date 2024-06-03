class Solution {
    public int[] solution(String myString) {
        int[] answer;
        int cnt=0;
        int idx=0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                cnt++;
            }
        }
        answer=new int[cnt+1];
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                idx++;
            }else {
                answer[idx]++;
            }
        }
        return answer;
    }
}