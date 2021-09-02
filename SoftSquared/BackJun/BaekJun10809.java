package Step7;

import java.util.Scanner;

public class BaekJun10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int array[] = new int[26];

        for(int i=0;i<26;i++){
            array[i] = -1;
        }
        for(int i=0;i<s.length();i++){
            if(array[(s.charAt(i)-'a')]==-1)
                array[(s.charAt(i)-'a')] = i;
        }
        for(int j=0; j<26;j++){
            System.out.print(array[j]+" ");
        }
    }
}
