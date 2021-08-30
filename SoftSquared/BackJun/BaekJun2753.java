package Step2;

import java.util.Scanner;

public class BaekJun2753 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a%4==0){
            if(a%400==0)
                System.out.print(1);
            else if(a%100==0)
                System.out.print(0);
            else
                System.out.print(1);
        }
        else
            System.out.print(0);
    }
}
