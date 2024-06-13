import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        ArrayList<Integer> aNum=new ArrayList<>();
        ArrayList<Integer> bNum=new ArrayList<>();
        
        for(int i=0; i<A.length; i++){
            aNum.add(A[i]);
        }
        for(int i=0; i<B.length; i++){
            bNum.add(B[i]);
        }
        Collections.sort(aNum);
        Collections.sort(bNum, Collections.reverseOrder());
        for(int i=0; i<aNum.size(); i++){
            answer+=aNum.get(i)*bNum.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}