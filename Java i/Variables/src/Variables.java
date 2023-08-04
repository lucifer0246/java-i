public class Variables {
    public static void main(String[] args) {
        int value1 = 10 , value2 = 20;
        int value3 = (2*2)+3 ;

        float f = 2.3f;
        double d = 2.45d;

        char a = 'b';

        String hello = "Hello sam!";

        boolean t = true;

        int max = 2147483647;  // 2147483648 = error
        int min = -2147483648;  // -2147483649 = error

        short shortMax = 32767;
        short shortMin = -32768;

        long longMax = 9223372036854775807l;    // 9223372036854775808l = error
        long longMin = -9223372036854775808l  ;  // -9223372036854775809l = error

        byte byteMax = 127;    //  128 = error
        byte byteMin = -128;   // -129 = error

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(a);
        System.out.println(hello);
        System.out.println("range for int is "+ max +" , " +min);
        System.out.println("range for long is "+ longMax +" , " +longMin);
        System.out.println("range for short is "+ shortMax  +" , " +shortMin);
        System.out.println("range for byte is "+ byteMax  +" , " + byteMin);
        System.out.println(hello);
        System.out.println(t);
        System.out.println(f);
        System.out.println(d);
    }
}
