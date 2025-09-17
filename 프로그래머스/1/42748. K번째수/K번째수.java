import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        int index = 0;
        for(int i=0; i<commands.length; i++){
            int idx=0;
            cnt=commands[i][1]-commands[i][0]+1;
            int[] num_list=new int[cnt];
            for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){
                num_list[idx]=array[j];
                idx++;
            }
            Arrays.sort(num_list);
            answer[index]=num_list[commands[i][2]-1];
            index++;
        }
        return answer;
    }
}