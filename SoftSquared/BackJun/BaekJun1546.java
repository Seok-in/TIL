package Step5;

import java.util.Scanner;

public class BaekJun1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float array[] = new float[n];
        float max_value =0;
        float new_sum =0;
        float average =0;
        for(int i =0;i<n;i++){
            array[i] = sc.nextInt();
            if(max_value < array[i])
                max_value = array[i];
        }
        for(int i=0;i<n;i++)
            new_sum += ((array[i]/max_value)*100);
        average = new_sum/n;
        System.out.print(average +" " + max_value);
    }
}
