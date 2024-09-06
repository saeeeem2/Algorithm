class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int cnt=0;
        int idx=0;
        if(n==1){
            cnt=slicer[1]+1;
        } else if(n==2){
            cnt=num_list.length-slicer[0];
        } else if(n==3){
            cnt=slicer[1]-slicer[0]+1;
        } else {
            cnt=(slicer[1]-slicer[0])/slicer[2]+1;
        }
        int[] answer = new int[cnt];
        if(n==1){
            for(int j=0; j<=slicer[1]; j++){
                answer[idx]=num_list[j];
                idx++;
            }
        } else if(n==2){
            for(int k=slicer[0]; k<num_list.length; k++){
                answer[idx]=num_list[k];
                idx++;
            }
        } else if(n==3){
            for(int l=slicer[0]; l<=slicer[1]; l++){
                answer[idx]=num_list[l];
                idx++;
            }
        } else {
            for(int m=slicer[0]; m<=slicer[1]; m=m+slicer[2]){
                answer[idx]=num_list[m];
                idx++;
            }
        }
        return answer;
    }
}