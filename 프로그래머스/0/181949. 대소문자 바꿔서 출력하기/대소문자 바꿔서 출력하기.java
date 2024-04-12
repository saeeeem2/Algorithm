import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
               String[] b = a.split("");
        char c[] = new char[b.length];
        for(int i = 0; i<b.length; i++) {
        	c[i] = b[i].charAt(0);
        }
        for(int i=0; i<c.length; i++){
            if(Character.isUpperCase(c[i])){
               c[i] = Character.toLowerCase(c[i]);
            } else {
               c[i] = Character.toUpperCase(c[i]);
            }
        }
        System.out.println(c);
    }
}