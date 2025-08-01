class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = board[0]/2;
        int y = board[1]/2;
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("right") && answer[0] != x){
                answer[0]++;
            } else if(keyinput[i].equals("left") && answer[0] != -x){
                answer[0]--;
            } else if(keyinput[i].equals("up") && answer[1] != y){
                answer[1]++;
            } else if(keyinput[i].equals("down") && answer[1] != -y){
                answer[1]--;
            } 
        }
        return answer;
    }
}