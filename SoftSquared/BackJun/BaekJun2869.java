package Step8;

import java.util.Scanner;

public class BaekJun2869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int result =0;
        for(int i=1;v>0;i++){
            v -= a;
            if(v>0)
                v+=b;
            result =i;
        }
        System.out.print(result);
    }
}
