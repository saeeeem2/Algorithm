class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        String strArr[] = str.split("");
        for(int i=0; i<strArr.length; i++){
            int num=Integer.parseInt(strArr[i]);
            answer+=num;
        }
        return answer;
    }
}