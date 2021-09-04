package Step10;

import java.util.Scanner;

public class BaekJun10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for(int i=2;i<=n;i++){
            array[i] = array[i-1]+array[i-2];
        }
        System.out.print(array[n]);
    }
}
