import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int list[]={a,b,c,d};
        Arrays.sort(list);
        //다 같을 때
        if(list[0]==list[3]){
            answer=1111*list[0];
        } 
        //숫자 3개가 같을 때
        else if(list[0]==list[1]&&list[1]==list[2]&&list[2]!=list[3]){
            answer=(int)Math.pow((10*list[0]+list[3]),2);
        } else if(list[3]==list[1]&&list[1]==list[2]&&list[2]!=list[0]){
            answer=(int)Math.pow((10*list[3]+list[0]),2);
        }
        //숫자 2개씩 같을 때
        else if(list[0]==list[1] && list[2]==list[3]){
            answer=(list[0]+list[2])*Math.abs(list[0]-list[2]);
        } 
        //두 숫자가 같고 나머지 두 숫자가 서로 다를 때
        else if(list[0]==list[1]&&list[2]!=list[3]){
            answer=list[2]*list[3];
        } else if(list[1]==list[2]&&list[0]!=list[3]){
            answer=list[0]*list[3];
        } else if(list[2]==list[3]&&list[0]!=list[1]) {
            answer=list[0]*list[1]; 
        } 
        //다 다를 때
        else {
            answer=list[0];
        }    
        return answer;
    }
}