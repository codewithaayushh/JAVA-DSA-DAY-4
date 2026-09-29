import java.util.Scanner;

public class breakProblem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        do{
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
    }
}
