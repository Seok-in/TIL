package Step10;

import java.util.Scanner;

public class BaekJun10872 {
    static int factorial(int num){
        if(num > 1)
            return num + factorial(num-1);
        else
            return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.print(result);
    }
}
