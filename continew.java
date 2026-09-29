import java.util.Scanner;

public class continew {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

        for(int i=0;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
