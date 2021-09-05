package Step8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BaekJun2775 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int array[][] = new int[k+1][n+1];

            for(int j=1;j<n+1;j++){
                array[0][j] = j;
            }
            array[1][0]=0;
            for(int p=1;p<k+1;p++){
                for(int x=1;x<n+1;x++){
                    array[p][x] = array[p][x-1]+array[p-1][x];
                }
            }
            System.out.print(array[k][n]);
        }



    }
}
