import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        i = sc.nextInt();
        if (i % 2 == 0){
            System.out.println("Entered number is Even");
        }else {
            System.out.println("Entered number is Odd");
        }
    }
}
