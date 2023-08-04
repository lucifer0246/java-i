// checking given number is palindrome or not

import java.util.*;
public class palindroame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, r, temp;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        temp = n;
        while (n != 0){
            r = n % 10;
            sum = sum * 10 + r;
            n = n/10;
        }
        System.out.println("The reverse of given number is "+ sum);
        if(sum == temp){
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Given number is not palindrome");
        }
    }
}
