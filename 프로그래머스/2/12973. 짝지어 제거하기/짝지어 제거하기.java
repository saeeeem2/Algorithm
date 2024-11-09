import java.util.*;
class Solution
{
    public int solution(String s)
    {
        List<String> list=new ArrayList<>();
        int answer = -1;
        String[] s_list=s.split("");
        for(int i=0; i<s_list.length; i++){
            if(list.size()>0 && list.get(list.size()-1).equals(s_list[i])){
                list.remove(list.size()-1);
            }else{
                list.add(s_list[i]);
            }
        }
        if(list.size()==0){
            answer=1;
        } else {
            answer=0;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}