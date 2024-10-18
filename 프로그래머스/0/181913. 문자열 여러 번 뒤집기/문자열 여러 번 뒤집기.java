class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i=0; i<queries.length; i++){
            String[] temp=answer.split("");
            answer="";
            for(int j=0; j<temp.length; j++){
                if(j==queries[i][0]){
                    for(int k=queries[i][1]; k>=queries[i][0]; k--){
                        answer+=temp[k];
                        j++;
                        if(k==queries[i][0]){
                            j--;
                        }
                    }
                }else{ 
                    answer+=temp[j];
                }
                
            }
        }
        return answer;
    }
}