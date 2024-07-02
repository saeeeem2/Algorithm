class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str_list=my_string.split("");
        for(int i=0; i<str_list.length; i++){
            boolean check=true;
            for(int j=0; j<answer.length(); j++){
                if(str_list[i].equals(answer.charAt(j)+"")){
                    check=false;
                    break;
                }
            }
            if(check){
                answer+=str_list[i];
            }
        }
        return answer;
    }
}