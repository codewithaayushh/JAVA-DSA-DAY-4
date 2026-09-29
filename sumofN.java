import java.util.Scanner;

public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Ente n number");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;
        while(i<=num){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
