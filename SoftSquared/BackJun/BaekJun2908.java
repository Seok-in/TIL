package Step7;

import java.util.Scanner;

public class BaekJun2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        String x1 = Integer.toString(x);
        String y1 = Integer.toString(y);

        x = ((x1.charAt(2)-'0') *100)+ ((x1.charAt(1)-'0')*10) +((x1.charAt(0)-'0'));
        y = ((y1.charAt(2)-'0') *100)+ ((y1.charAt(1)-'0')*10) +((y1.charAt(0)-'0'));
        if(x>y)
            System.out.print(x);
        else
            System.out.print(y);
    }

}
