package Step5;

import java.util.Scanner;

public class BaekJun10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max_value = a[0];
        int min_value = a[0];

        for(int i =1; i<n; i++){
            if(max_value < a[i])
                max_value = a[i];
            if(min_value>a[i])
                min_value = a[i];
        }
        System.out.println("최소 :" + min_value);
        System.out.println("최대 :"+ max_value);
    }
}
