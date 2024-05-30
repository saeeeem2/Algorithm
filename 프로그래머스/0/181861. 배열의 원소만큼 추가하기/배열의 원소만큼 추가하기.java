class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int number=0;
        int idx=0;
        for(int i=0; i<arr.length; i++){
            number+=arr[i];
        }
        answer=new int[number];
        for(int i=0; i<arr.length; i++){
            number=arr[i];
            for(int j=0; j<number; j++){
                answer[idx]+=arr[i];
                idx++;
            }
        }

        return answer;
    }
}