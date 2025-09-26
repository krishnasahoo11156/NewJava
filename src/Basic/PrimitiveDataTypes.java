package Basic;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        //In this code we will be using all the primitive data types at once
        //There are 8 primitive data types in Java
        byte a = 127;
        System.out.println("The range of byte is from -128 to 127");
        System.out.println("Byte value: " + a);
        System.out.println();

        short b = 32767;
        System.out.println("The range of short is from -32,768 to 32,767");
        System.out.println("Short value: " + b);
        System.out.println();

        int c = 2147483647;
        System.out.println("The range of int is from -2,147,483,648 to 2,147,483,647");
        System.out.println("Int value: " + c);
        System.out.println();

        long d = 9223372036854775807L;
        System.out.println("The range of long is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println("Long value: " + d);
        System.out.println();

        float e = 3.4028235E38f;
        System.out.println("The range of float is from 1.4E-45 to 3.4028235E38");
        System.out.println("Float value: " + e);
        System.out.println();

        double f = 1.7976931348623157E308;
        System.out.println("The range of double is from 4.9E-324 to 1.7976931348623157E308");
        System.out.println("Double value: " + f);
        System.out.println();   

        char g = 'A';
        System.out.println("The range of char is from 0 to 65,535");
        System.out.println("Char value: " + g); 
        System.out.println();

        boolean h = true;
        System.out.println("Boolean value: " + h);
        System.out.println("Boolean value: " + !h); //negation of boolean value
        System.out.println();


    }
}
