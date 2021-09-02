package Step7;

import java.util.Scanner;

public class BaekJun5622 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int array[] = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8};
        int timer =0;
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            timer += array[s.charAt(i)-'A'];
            timer += 2;
        }
        System.out.print(timer);
    }
}
