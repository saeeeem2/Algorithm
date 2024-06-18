class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr3 = new String[n];
        String[] arr4 = new String[n];
        String temp="";
        for(int i=0; i<n; i++){
            answer[i]="";
            arr3[i]=Integer.toBinaryString(arr1[i]);
            arr4[i]=Integer.toBinaryString(arr2[i]);
            if(arr3[i].length()<n){
                temp=arr3[i];
                arr3[i]="";
                for(int k=0; k<n-temp.length(); k++){
                    arr3[i]+="0";
                }
                arr3[i]=arr3[i]+temp;
            } 
            if(arr4[i].length()<n){
                temp=arr4[i];
                arr4[i]="";
                for(int l=0; l<n-temp.length(); l++){
                    arr4[i]+="0";
                }
                arr4[i]=arr4[i]+temp;                    
            }            
            for(int j=0; j<n; j++){
                if(arr3[i].charAt(j)=='1'||arr4[i].charAt(j)=='1'){
                    answer[i]+="#";
                } else if(arr3[i].charAt(j)=='0'&&arr4[i].charAt(j)=='0') {
                    answer[i]+=" ";
                }
            }
        }
        return answer;
    }
}