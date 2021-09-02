package Step7;

import java.util.Scanner;

public class BaekJun1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for(int i=0; i<n; i++)
        {
            int array[] = new int[26];
            for(int k=0;k<26;k++){
                array[k] =0;
            }
            String s = sc.next();

            for (int j=0; j<s.length();j++){
                if(array[s.charAt(j) -'a'] == 0 || s.charAt(j-1) == s.charAt(j))
                    array[s.charAt(j)-'a'] += 1;
                else{
                    count -= 1;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
