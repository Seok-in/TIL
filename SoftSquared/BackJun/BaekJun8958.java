package Step5;

import java.util.Scanner;

public class BaekJun8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        for(int k=0; k<n; k++){
            score[k] =0;
        }
        int count = 0;
        for(int i=0;i<n;i++){
            String s = sc.next();
            count =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='O')
                    count += 1;
                else if(s.charAt(j)=='X')
                    count = 0;
                score[i] += count;
            }
        }
        for(int x=0;x<n;x++)
            System.out.println(score[x]);
    }
}
