package Step7;

import java.util.Scanner;

public class BaekJun11720 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++)
            sum += (s.charAt(i)-'0');
        System.out.print(sum);
    }
}
