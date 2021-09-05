package Step8;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BaekJun10250 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t =sc.nextInt();
        for(int i=0;i<t;i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int result = n/h+(n%h)*100+1;
            bw.write(Integer.toString(result)+"\n");
        }
        bw.flush();
    }


}
