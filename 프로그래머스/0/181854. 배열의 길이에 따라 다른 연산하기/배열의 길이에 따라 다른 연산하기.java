class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        for(int i=0; i<arr.length; i=i+2){
            if(arr.length%2==0){
                answer[i+1]=arr[i+1]+n;
            }else {
                answer[i]=arr[i]+n;
            }
        }
        return answer;
    }
}