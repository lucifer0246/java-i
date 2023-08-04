import  java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println(" ");
        System.out.println("hii "+name);
        System.out.println(" ");

        System.out.println("Enter your fullname: ");
        String full_name = input.nextLine();
        System.out.println("Glad meeting you "+full_name);
        System.out.println(" ");



        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println(" ");
        System.out.println("You are "+age+" years old!!");
        System.out.println(" ");
        input.close();
    }
}
