class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr.length >= 2 ? new int[arr.length-1] : new int[1];
        int min=arr[0];
        int idx=0;
        int index=0;
        if(arr.length==1){
            answer[index]=-1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
                idx=i;
            } 
        }
        for(int i=0; i<arr.length; i++){
            if(i!=idx){
                answer[index]=arr[i];
                index++;
            }
        }
        
        return answer;
    }
}