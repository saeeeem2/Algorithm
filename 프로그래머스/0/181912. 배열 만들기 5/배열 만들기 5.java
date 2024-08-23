class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int cnt=0;
        int idx=0;
        String str="";
        for(int i=0; i<intStrs.length; i++){
            str="";
            for(int j=s; j<s+l; j++){
                str+=intStrs[i].charAt(j)+"";
                if(k<Integer.parseInt(str)){
                    cnt++;
                }
            }
        }
        int[] answer = new int[cnt];
        for(int i=0; i<intStrs.length; i++){
            str="";
            for(int j=s; j<s+l; j++){
                str+=intStrs[i].charAt(j)+"";
                if(k<Integer.parseInt(str)){
                    answer[idx]=Integer.parseInt(str);
                    idx++;
                }
            }
        }
        return answer;
    }
}