import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=100;
        int num=0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            num=Math.abs(n-array[i]);
            if(min>num){
                min=num;
                answer=array[i];
            }
        }
        return answer;
    }
}