import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        int cnt=0;
        int idx=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            } 
        }
        
        answer=cnt>0 ? new int[cnt] : new int[] {-1};
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[idx]=arr[i];
                idx++;
            }
        }   
        
        Arrays.sort(answer);
        return answer;
    }
}