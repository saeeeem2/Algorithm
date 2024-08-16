import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    list.add(arr[i]);                    
                }
            } else {
                for(int j=0; j<arr[i]; j++){
                    list.remove(list.size()-1);                    
                }
            }            
        }
        int[] answer = new int[list.size()];
        int size=0;
        for(int temp : list){
            answer[size++]=temp;
        }
        return answer;
    }
}