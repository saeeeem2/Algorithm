import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> num = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i != j){
                    num.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer = new int[num.size()];
        int idx=0;
        ArrayList<Integer> list=new ArrayList<>(num);
        for(int i=0; i<list.size(); i++){
            answer[idx]=list.get(i);
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}