public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening) = byte >short >int >long >float >double
        // Explicit casting (narrowing) = double >float >long> int> short> byte

        int value1 = 10;
        int value2 = 3;
        System.out.println(value1 / value2); // 3

        double value3 = 3;
        System.out.println(value1 / value3); // 3.3333333333333335

        double value4 = 10;
        System.out.println(value4 / value3); // 3.3333333333333335

        float value5 = 3;
        System.out.println(value1 / value5);

        int y = 10;
        short x = (short) y;
        System.out.println(x);

        short z = (byte) y;
        System.out.println(z);

        float v1 = 10.0f;
        double v2 = v1;
        System.out.println(v2);

        // double v3 = 20.0d;
        // float v4 = v3; // Type mismatch: cannot convert from double to float

        double v3 = 20.0d;
        float v4 = (float)v3;
        System.out.println(v4);
    }
}
