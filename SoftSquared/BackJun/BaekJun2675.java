package Step7;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BaekJun2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            String s = sc.next();
            for(int j=0;j<k;j++)
                bw.write(s);
            bw.write("\n");
        }
        bw.flush();
    }
}
