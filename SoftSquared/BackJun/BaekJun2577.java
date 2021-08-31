package Step5;

import java.util.Scanner;

public class BaekJun2577 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;
        String s = Integer.toString(result);
        int x[] ={0, 0, 0, 0, 0, 0, 0, 0,0,0};
        for(int i=0;i<s.length();i++){
            x[s.charAt(i)-'0']+=1;
        }
        for(int i=0;i<10;i++)
            System.out.println(x[i]);

    }
}
