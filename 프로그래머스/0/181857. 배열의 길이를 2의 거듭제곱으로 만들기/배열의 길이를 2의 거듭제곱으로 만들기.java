class Solution {
    public int[] solution(int[] arr) {
        int cnt=0;
        
        for(int i=0; i<1000; i++){
            if(arr.length<=Math.pow(2,i)) {
                cnt=(int)Math.pow(2,i);
                break;
            }
        }
        
        int[] answer=new int[cnt];
        
        for(int i=0; i<arr.length; i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}