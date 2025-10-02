class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] str_list = my_string.split("");
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals(alp)){
                str_list[i] = str_list[i].toUpperCase();
            }
            answer += str_list[i];
        }
        return answer;
    }
}