class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] num_list=new String[3];
        for(int i=0; i<binomial.length(); i++){
            if(binomial.contains("+")){
                num_list=binomial.split(" \\+ ");
                answer=Integer.parseInt(num_list[0])+Integer.parseInt(num_list[1]);
            }else if(binomial.contains("-")){
                num_list=binomial.split(" \\- ");
                answer=Integer.parseInt(num_list[0])-Integer.parseInt(num_list[1]);
            }else{
                num_list=binomial.split(" \\* ");
                answer=Integer.parseInt(num_list[0])*Integer.parseInt(num_list[1]);
            }
        }
        return answer;
    }
}