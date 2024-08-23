import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(stkList.size()==0){
                stkList.add(arr[i]);
            } else if(stkList.size()>0 && stkList.get(stkList.size()-1)==arr[i]){
                stkList.remove(stkList.size()-1);
            } else if(stkList.size()>0 && stkList.get(stkList.size()-1)!=arr[i]){
                stkList.add(arr[i]);
            } 
        }
        int[] answer = new int[stkList.size()];
        if(stkList.size()==0){
            answer=new int[]{-1};
            return answer;
        }
        int size=0;
        for(Integer temp : stkList){
            answer[size++]=temp;
        }
        return answer;
    }
}