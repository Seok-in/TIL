package Step5;

import java.util.Scanner;

public class BaekJun3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[42];
        for(int i =0; i<42;i++)
            array[i] =0;
        for(int j=0;j<10;j++){
            int x =sc.nextInt();
            array[x%42] += 1;
        }
        int count = 0;
        for(int k=0;k<42;k++){
            if(array[k] != 0)
                count +=1;
        }
        System.out.print(count);
    }
}
