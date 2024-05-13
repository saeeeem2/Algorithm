import java.util.*;
class Solution {
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<Long>();
        String answer = "";
        for(long i=n; i>0; i=i/10){
            list.add(i%10);
        }
        list.sort(Comparator.reverseOrder());
        for(int i=0; i<list.size(); i++){
            answer+=""+list.get(i);
        }
        return Long.parseLong(answer);
    }
}