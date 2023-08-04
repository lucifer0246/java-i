public class ExampleLoops1 {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i < 10 && j < 10; i++, j++) {
            System.out.println("i = " + i + " ,j = " + j);
        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        for (int i = 1, j = 1; i < 10 && j < 10; i++, j++) {
            j++;
            System.out.println("i = " + i + " ,j = " + j);
        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        for (int i = 1, j = 1; i < 10 || j < 10; i++, j++) {
            j++;
            System.out.println("i = " + i + " ,j = " + j);
        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        int i = 1, j = 1;

        while (i < 10 && j < 10) {
            i++;
            j++;
            System.out.println("i = " + i + " ,j = " + j);

        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        i = 1;
        j = 1;

        do {
            i++;
            j++;
            System.out.println("i = " + i + " ,j = " + j);
        } while (i < 10 || j < 10);

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        for(int a =1; a<10; a++) {
            System.out.println(a);
            if(a == 5) {
                break;
            }
        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        for(int a=1 ; a<=10; a++ ) {
            System.out.println(a);
            if(a==5) {
                continue;
            }
        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");

        for(int a=1 ; a<=10; a++ ) {
            if(a==5) {
                continue;
            }
            System.out.println(a);
        }

        System.out.println(" ");
        System.out.println("******************** ");
        System.out.println(" ");


    }
}
