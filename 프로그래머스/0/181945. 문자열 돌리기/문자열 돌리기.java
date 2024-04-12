import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("");
        char c[] = new char[b.length];
        for(int i=0; i<b.length; i++){
            c[i] = b[i].charAt(0);
            System.out.println(c[i]);
        }
    }
}