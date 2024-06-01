class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        int cnt=0;
        int idx=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    cnt++;
                }                
            }
        }
        answer=new int[arr.length-cnt];
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    flag= true;
                } 
            }
            if(!flag){
			    answer[idx]=arr[i];
                idx++;
			}
        }  
        return answer;
    }
}


