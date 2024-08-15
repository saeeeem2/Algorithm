class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        String[] str_arr=my_str.split("");
        int idx=0;
        if(my_str.length()%n==0){
            answer=new String[my_str.length()/n];
        } else {
            answer=new String[my_str.length()/n+1];
        }
        for(int i=0; i<str_arr.length; i=i+n){
            answer[idx]="";
            for(int j=i; j<i+n; j++){
                answer[idx]+=str_arr[j];
                if(answer[idx].length()==n){
                    idx++;                  
                }
                if(j==str_arr.length-1){
                    break;
                }
            }
        }
        return answer;
    }
}