import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int idx=0;
        int cnt=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                cnt++;
            }
        }
        answer=new int[cnt+1];
        answer[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]){
                idx++;
                answer[idx]=arr[i];
            }
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}