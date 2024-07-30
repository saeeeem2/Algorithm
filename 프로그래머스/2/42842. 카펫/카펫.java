class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1; i<=brown; i++){
            for(int j=1; j<=brown; j++){
                if((2*i-4)+(2*j)==brown && i<=j && i*j-brown==yellow){
                    answer[0]=j;
                    answer[1]=i;
                    break;
                }
            }
        }
        return answer;
    }
}