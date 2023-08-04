import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area, length, breadth;
        System.out.println("Enter length and Breadth : ");
        length = input.nextDouble();
        breadth = input.nextDouble();
        area = length * breadth;
        System.out.println("Area of rectangle with length "+length+" and with breadth "+breadth+" is "+area);

        input.close();


    }
}
