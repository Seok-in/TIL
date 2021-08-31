package Step5;

import java.util.Scanner;

public class BaekJun2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[9];
        int max_value =0;
        int max_index =0;
        for(int i =0; i<a.length;i++) {
            a[i] = sc.nextInt();
            if(a[i]>max_value) {
                max_value = a[i];
                max_index = i;
            }
        }
        System.out.print(max_index +1 +"번째 , 최댓값 : " + max_value);
    }
}
