package Step6;

import java.util.Scanner;

public class BaekJun1065 {
    public static int func1(int num){
        int count = 0;
        if(num < 100)
            return 99;
        else{
            for(int i=100;i<=num;i++){
                int x = i/100;
                int y = ((i%100)/10);
                int z = (i%10);
                if((x -y)==(y-z))
                    count += 1;
            }
            return count + 99;
        }

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x =func1(sc.nextInt());
        System.out.print(x);
    }
}
