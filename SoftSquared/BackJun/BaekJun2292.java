package Step8;

import java.util.Scanner;

public class BaekJun2292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        int index = 1;
        for(int i=1;n>0;i++){
            n -= (6*i);
            index += 1;
        }
        System.out.print(index);
    }
}
