public class Boolean {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 5;

        System.out.println((a<b)&&(b<c));
        System.out.println((a<b)||(b<c));
        System.out.println((a<=b)&&(b<=c));
        System.out.println((a<=b)||(b<=c));
        System.out.println(!(a<=b));
    }
}
