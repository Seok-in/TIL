package Step6;

public class BaekJun4673 {
    public static int dn(int num){
        int result = num;

        while(num>=10){
            result += (num%10);
            num /=10;

        }
        if(num<10)
            result += num;
        return result;
    }
    public static void main(String args[]){
        boolean array[] = new boolean[10001];
        for(int i=1;i<10001;i++){
            if(dn(i)<10000)
                array[dn(i)] = true;

        }
        for(int j=1;j<10001;j++){
            if(array[j]!=true)
                System.out.println(j);
        }
    }
}
