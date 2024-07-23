class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] list=letter.split(" ");
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0; i<list.length; i++){
            for(int j=0; j<morse.length; j++){
                if(list[i].equals(morse[j])){
                    answer+=(char)(j+97);
                }
            }
        }
        return answer;
    }
}