public class If {
    public static void main(String[] args) {
        // using one variable
        int x = 5;
        if (x == 5) {
            System.out.println("value of x is 5");
        }else {
            System.out.println("what happened");
        }
        System.out.println(" ");


        // using two variables
        int x1 = 4, y1 = 5;
        if (x1<y1) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println(" ");

        // use of boolean operator with comparison operator
        int x2 = 5, y2 =10;
        if (!(x2<y2)||(x2==y2)) {
            System.out.println("condition is True");
        }else {
            System.out.println("condition is False");
        }
    }
}
