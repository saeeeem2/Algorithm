class Solution {
    public int[][] solution(int[][] arr) {
        int cnt=0;
        int idx=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr.length>=arr[i].length){
                    cnt=arr.length;
                } else {
                    cnt=arr[i].length;
                }
            }
        }
        int[][] answer = new int[cnt][cnt];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr.length>arr[i].length){
                    answer[i][j]=arr[i][j];
                } else {
                    answer[i][j]=arr[i][j];
                }
            }
        }
        return answer;
    }
}