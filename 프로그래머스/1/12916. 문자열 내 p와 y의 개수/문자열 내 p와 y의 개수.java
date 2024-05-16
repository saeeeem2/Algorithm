class Solution {
    boolean solution(String s) {
        String str=s.toUpperCase();
        int pCnt=0;
        int yCnt=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='P'){
                pCnt++;
            } 
            if(str.charAt(i)=='Y'){
                yCnt++;
            }
        }
        return pCnt==yCnt ? true : false; 
    }
}