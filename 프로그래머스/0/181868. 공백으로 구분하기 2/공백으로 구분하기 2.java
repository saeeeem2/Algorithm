class Solution {
    public String[] solution(String my_string) {
        String[] str_list = my_string.split(" ");
        String[] answer;
        int idx=0;
        int cnt=0;
        for(int i=0; i<str_list.length; i++){
            if(!str_list[i].isEmpty()){
                cnt++;
            }
        }
        answer=new String[cnt];
        for(int i=0; i<str_list.length; i++){
           if(!str_list[i].isEmpty()){
              answer[idx]=str_list[i];
              idx++; 
           }              
       }
        return answer;
    }
}