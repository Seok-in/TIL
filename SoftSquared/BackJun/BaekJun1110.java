package Step4;

import java.util.Scanner;

public class BaekJun1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
        int x = n;
        if(n < 10)
            n *= 10;
        int count =0;
        while(x != result){
            result = (n%10)*10 + (((n/10) + (n%10)) % 10);
            n = result;
            count+=1;
        }
        System.out.print(count);
    }
}
