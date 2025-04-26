class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] sp1={1,2,3,4,5};
        int[] sp2={2,1,2,3,2,4,2,5};
        int[] sp3={3,3,1,1,2,2,4,4,5,5};
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int i=0; i<answers.length; i++){
            if(sp1[i%sp1.length]==answers[i]){
                cnt1++;
            }
            if(sp2[i%sp2.length]==answers[i]){
                cnt2++;
            }
            if(sp3[i%sp3.length]==answers[i]){
                cnt3++;
            }
        }
        int max=cnt1;
        int len=0;
        if(max<cnt2){
            max=cnt2;
        }
        if(max<cnt3){
            max=cnt3;
        }
        if(max==cnt1){
            len++;
        } 
        if(max==cnt2){
            len++;
        }
        if(max==cnt3){
            len++;
        }
        answer=new int[len];
        if(max==cnt1 && max>cnt2 && max>cnt3){
            answer[0]=1;
        } else if(max==cnt2 && max>cnt1 && max>cnt3){
            answer[0]=2;
        } else if(max==cnt3 && max>cnt1 && max>cnt2){
            answer[0]=3;
        } else if(max==cnt1 && max==cnt2 && max>cnt3){
            answer[0]=1;
            answer[1]=2;
        } else if(max==cnt2 && max==cnt3 && max>cnt1){
            answer[0]=2;
            answer[1]=3;            
        } else if(max==cnt1 && max==cnt3 &&max>cnt2){
            answer[0]=1;
            answer[1]=3;            
        } else if(max==cnt1 && max==cnt2 && max==cnt3) {
            answer[0]=1;
            answer[1]=2;
            answer[2]=3;
        }
        return answer;
    }
}