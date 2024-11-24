class Solution {
    public String[] solution(String myStr) {
        myStr=myStr.replaceAll("[abc]"," ");
        String[] myString = myStr.split(" ");
        int idx=0;
        int cnt=1;
        for(int i=0; i<myString.length; i++){
            if(!myString[i].equals("")){
                cnt++;
            }
        }
        String[] answer=new String[cnt-1]; 
        if(cnt==1){
            answer=new String[1]; 
            answer[0]="EMPTY";
        }
        for(int i=0; i<myString.length; i++){
            if(!myString[i].equals("")){
                answer[idx]=myString[i];
                idx++;
            } else {
                answer[idx]="EMPTY";
            }
        }
        return answer;
    }
}