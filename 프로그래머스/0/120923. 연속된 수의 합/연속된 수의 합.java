class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int a1=0;
        
        if(num%2==0){
            a1=total/num-(num/2-1);
        } else{
            a1=total/num-(num/2);
        }
        for(int i=0; i<num; i++){
            answer[i]=a1++;
        }
        
        return answer;
    }
}