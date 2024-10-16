import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int idx=0;
        ArrayList<Integer> arr_list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!arr_list.contains(arr[i])){
                arr_list.add(arr[i]);
            }
            if(arr_list.size()==k){
                break;
            }
        }
        while(arr_list.size()<k){
            arr_list.add(-1);
        } 
        for(int temp : arr_list){
            answer[idx++]=temp;
        }
        return answer;
    }
}