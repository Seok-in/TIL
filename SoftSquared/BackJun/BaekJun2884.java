package Step2;

import java.util.Scanner;

public class BaekJun2884 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            System.out.print(h + "시" + (m-45) + "분 입니다.");
        }
        else if(m<45){
            if(h==0)
                h = 23;
            else
                h -= 1;
            System.out.print(h+ "시" + (m+15)+ "분 입니다.");
        }

    }
}


