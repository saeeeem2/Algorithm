class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        for(int i=0; i<str.length(); i++){
            int num=Integer.parseInt(String.valueOf(str.charAt(i)));
            answer+=num;
        }
        return answer;
    }
}