import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list=new ArrayList<>();
        int idx=0;
        for(int num : arr){
            list.add(num);
        }
        for(int i=0; i<query.length; i++){
            if(i%2==0){
                for(int j=list.size()-1; j>query[i]; j--){
                    list.remove(j);
                }
            } else {
                for(int j=query[i]-1; j>=0; j--){
                    list.remove(j);
                }
            }
        }
        int[] answer =new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[idx++]=list.get(i);
        }
        return answer;
    }
}