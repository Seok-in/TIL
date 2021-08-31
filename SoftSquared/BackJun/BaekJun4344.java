package Step5;

import java.util.Scanner;

public class BaekJun4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        float rate[] = new float[c];
        for(int i=0; i<c;i++){
            int x = sc.nextInt();
            float sum =0;
            float count =0;
            int array[] = new int[x];
            for(int j =0;j<x;j++){
                array[j]=sc.nextInt();
                sum += array[j];
            }
            for(int k=0;k<x;k++){
                if(array[k]>(sum/x))
                    count += 1;
            }
            rate[i] = count/x *100;

        }
        for(int t=0;t<c;t++) {
            System.out.printf("%.3f", rate[t]);
            System.out.print("% \n");
        }
    }
}
