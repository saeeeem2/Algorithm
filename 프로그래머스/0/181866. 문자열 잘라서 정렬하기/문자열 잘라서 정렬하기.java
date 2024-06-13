import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer;
        String[] str=myString.split("x");
        int idx=0;
        ArrayList<String> strArr=new ArrayList<String>();
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("")){
                strArr.add(str[i]);
            }
        }
        answer=strArr.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}