class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        int cnt=0;
        int idx=0;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                cnt++;
            } 
        }
        answer=new String[strArr.length-cnt];
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                answer[idx]=strArr[i];
                idx++;
            }
        }
        return answer;
    }
}