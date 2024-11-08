class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] pol_list=polynomial.split(" ");
        int xNum = 0;
        int num = 0;
        for(int i=0; i<pol_list.length; i=i+2){
            if(pol_list[i].contains("x")){
                if(pol_list[i].length()>1){
                   xNum+=Integer.parseInt(pol_list[i].substring(0,pol_list[i].length()-1)); 
                }else{
                    xNum++;
                }
            }else {
                num+=Integer.parseInt(pol_list[i]);
            }
        }
        if(xNum==0){
            answer = num+"";
        }else if(num==0){
            if(xNum==1){
                answer = "x";
            }else{
                answer = xNum + "x";
            }
        }else{
            if(xNum==1){
                answer = "x + " + num;
            }else{
                answer = xNum + "x + " + num;
            }
        }
        return answer;
    }
}