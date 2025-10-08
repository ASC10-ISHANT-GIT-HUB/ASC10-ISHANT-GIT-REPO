package com.demo.funda;

public class EqualsVsIdentical {
    static void main(String[] args) {
        Float f1= new Float(5.5f);
        Float f2= new Float(5.5f);
        System.out.println(f1.equals(f2));
        Float f3=f2;
        System.out.println(f3);
        f3=5.6f;
        System.out.println(f3);
        System.out.println(f2);

        System.out.println(f1.equals(f2));
        System.out.println(f1==f2);
        f1=f2;
        System.out.println(f1.equals(f2));
        System.out.println(f1==f2);

    }
}
