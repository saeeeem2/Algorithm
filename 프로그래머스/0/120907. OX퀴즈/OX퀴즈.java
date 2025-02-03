class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] quiz_list=new String[5];
        int index=0;
        
        for(int i=0; i<quiz.length; i++){
            quiz_list=quiz[i].split(" ");
            if(quiz_list[1].equals("+")){
                if(Integer.parseInt(quiz_list[0])+Integer.parseInt(quiz_list[2])==Integer.parseInt(quiz_list[4])){
                    answer[index]="O";
                    index++;
                } else {
                    answer[index]="X";
                    index++;
                }
            } else if(quiz_list[1].equals("-")){
                if(Integer.parseInt(quiz_list[0])-Integer.parseInt(quiz_list[2])==Integer.parseInt(quiz_list[4])){
                    answer[index]="O";
                    index++;
                } else {
                    answer[index]="X";
                    index++;
                }
            }
        }
        
        return answer;
    }
}