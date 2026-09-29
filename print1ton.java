import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        System.out.println("Enter the n Number");
        int range = sc.nextInt();

        while(counter<=range){
            System.out.println(counter);
            counter++;
        }
    }
}
