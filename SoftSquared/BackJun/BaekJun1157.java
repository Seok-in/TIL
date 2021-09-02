package Step7;

import java.util.Scanner;

public class BaekJun1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toUpperCase();

        int array[] = new int[26];
        int max_value =0;
        int max_index =0;
        String result =null;
        for(int i=0;i<26;i++)
            array[i] =0;
        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'A']+=1;
        }
        for(int i=0;i<26;i++){


            if(max_value<array[i]){
                max_value = array[i];
                max_index = i;
            }
        }
        for(int i=0;i<26;i++){
            if(max_value==array[i] && max_index != i)
                result ="?";
        }
        if(result == null){
            System.out.print((char)(max_index+65));
        }
        else
            System.out.print(result);
    }
}
