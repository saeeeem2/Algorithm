class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt=0;
        while(true){
            cnt=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50&&arr[i]%2==0){
                    arr[i]=arr[i]/2;
                } else if(arr[i]<50&&arr[i]%2!=0){
                    arr[i]=arr[i]*2+1;
                } else {
                    cnt++;
                }
            }
            if(cnt==arr.length){
                break;
            }
            answer++;
        }
        return answer;
    }
}