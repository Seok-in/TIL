package Step7;

import java.util.Scanner;

public class BaekJun1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =1;
        String s = sc.nextLine();
        if(s.charAt(0)==' ')
            count -= 1;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==' ')
                count +=1;
        }
        System.out.print(count);
    }
}
