package com.demo.packages.p1;

public class P1C2 {
    public static void main(String[] args) {
        P1C1 p1c1 = new P1C1();
//        System.out.println(p1c1.privateVar);
//        p1c1.privateMethod();

        //Note:- the private access specifer doesn't give the access of method across different classes but
        // the package private can give you the access of method in across different classes

        //package-private
        System.out.println(p1c1.packagePrivateVar);
        p1c1.packagePrivateMethod();

        //protected
        System.out.println(p1c1.protectedVar);
        p1c1.protectedMethod();

        //public
        System.out.println(p1c1.publicVar);
        p1c1.publicMethod();


    }
}
