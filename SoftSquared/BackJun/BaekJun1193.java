package Step8;

import java.util.Scanner;

public class BaekJun1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =1;
        int x = 1;
        int y = 1;
        if(n==1){
            System.out.print("1/1");
        }
        while(true){
            if(n>sum(k)&&n<=sum(k+1)){
                k+=1;
                break;
            }
            else if (n>sum(k))
                k+=1;
        }
        if(k%2==0){
            x = sum(k) - n + 1;
            y = n - sum(k-1);
        }
        if(k%2 ==1){
            x = n -sum(k-1);
            y = sum(k) - n + 1;
        }
        System.out.print(y+"/"+x);
    }
    static int sum(int num){
        if(num ==1)
            return num;
        else
            return num + sum(num-1);
    }
}

