class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num=0;
        for(int i=x; i>0; i=i/10){
            num+=i%10;
        }
        return x%num==0;
    }
}