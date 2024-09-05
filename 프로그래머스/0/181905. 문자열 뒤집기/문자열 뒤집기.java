class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] my_str=my_string.split("");
        for(int i=0; i<my_str.length; i++){
            if(i==s){
                for(int j=e; j>=s; j--){
                    answer+=my_str[j];
                    i++;
                }
            }
            if(i<my_str.length){
                answer+=my_str[i];
            }
        }
        return answer;
    }
}