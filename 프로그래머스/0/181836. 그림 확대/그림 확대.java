class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx=0;
        for(int i=0; i<picture.length; i++){
            answer[idx]="";
            for(int j=0; j<picture[i].length(); j++){
                for(int l=0; l<k; l++){
                    answer[idx]+=picture[i].charAt(j);
                }
            }
            idx++;
            for(int m=0; m<k-1; m++){
                answer[idx]=answer[idx-1];
                idx++;
            }
        }
        return answer;
    }
}