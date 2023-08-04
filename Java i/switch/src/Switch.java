public class Switch {
    public static void main(String[] args) {
        // use of single case
        int x = 10;

        switch (x) {
            case 1:
                System.out.println("The value of x is 1");
                break;
            case 2:
                System.out.println("The value of x is 2");
                break;
            case 3:
                System.out.println("The value of x is 3");
                break;
            default:
                System.out.println("The value of x is other than 1,2,3");
                break;
        }
        System.out.println(" ");



        // use of multiple case at a time
        char y = 'B';

        switch (y) {
            case 'a':
            case 'A':
                System.out.println("The value of y is a");
                break;

            case 'b':
            case 'B':
                System.out.println("The value of y is b");
                break;

            case 'c':
            case 'C':
                System.out.println("The value of y is c");
                break;

            default:
                break;
        }
        System.out.println(" ");



        // use of .toLowerCase with switch
        String name = "team";

        switch (name.toLowerCase()) {
            case "author":
                System.out.println("author");
                break;

            case "team":
                System.out.println("FC");
                break;

            case "editor":
                System.out.println("Harry");
                break;

            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
