import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkList = new ArrayList<>();
        int size=0;
        for(int i=0; i<arr.length; i++){
            if(arr.length>i){
                if(stkList.size()==0){
                    stkList.add(arr[i]);
                } else if(stkList.size()>0 && stkList.get(stkList.size()-1)<arr[i]){
                    stkList.add(arr[i]);
                } else if(stkList.size()>0 && stkList.get(stkList.size()-1)>=arr[i]){
                    stkList.remove(stkList.size()-1);
                    i--;
                }
            }
        }
        int[] stk = new int[stkList.size()];
        for(int temp : stkList){
            stk[size++]=temp;
        }
        return stk;
    }
}