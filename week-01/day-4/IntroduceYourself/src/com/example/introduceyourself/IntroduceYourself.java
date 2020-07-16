package com.example.introduceyourself;

public class IntroduceYourself {
    public static void main(String[] args) {
        System.out.println("Kyra");//  - Your name
        System.out.println(24); //  - Your age
        System.out.println(1.66);        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        byte b = 2;     // Byte (8 bit; min:-128; max: +127)
        short s = 567;  // Short (16 bit; min: -32768 ; max: +32 767)
        long l = 900000000000L; // long (64 bit; min: -9 223 372 036 854 775 808 ;max: 9 223 372 036 854 775 807)
        float f = 1.3f;
        float f2 = 4.5f; // Float (32 bit single precision IEEE 754)
        System.out.println(f2);
        double e = 8;
        e = Math.pow(e,3);
        System.out.println(e);
    }
}
