class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            for(int j=65; j<=122; j++){
                if(my_string.charAt(i)==j && my_string.charAt(i)<91){
                    answer[j-65]++;
                } else if(my_string.charAt(i)==j && my_string.charAt(i)>96) {
                    answer[j-71]++;
                }
            }
        }
        return answer;
    }
}