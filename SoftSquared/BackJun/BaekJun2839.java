package Step8;

import java.util.Scanner;

public class BaekJun2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=-1;
        for(int i=0;i<=n/5;i++){
            for(int j=0;j<=n/3;j++){
                if((5*i)+(3*j)==n) {
                    result = i + j;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}