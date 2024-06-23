class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] myString=my_string.split("");
        for(int i=0; i<indices.length; i++){
            myString[indices[i]]="";
        }
        for(int j=0; j<myString.length; j++){
            answer+=myString[j];
        }
        return answer;
    }
}