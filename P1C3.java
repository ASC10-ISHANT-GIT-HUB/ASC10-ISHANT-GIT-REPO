package com.demo.packages.p1;

public class P1C3 extends P1C1 {
    public static void main(String[] args) {
       P1C3 p1c3= new P1C3();
       p1c3.testAccess();

    }


    public  void testAccess(){
        P1C1 p1c1 = new P1C1();
        //private
        //System.out.println(p1c1.privateVar);
        //p1c1.privateMethod();
        //it won't run b'coz it is private

        //package-private
        System.out.println(p1c1.packagePrivateVar);
        p1c1.packagePrivateMethod();
        //protected
        System.out.println(p1c1.protectedVar);  // here we are calling the protected class by making the instance or object
        p1c1.protectedMethod();

        System.out.println(protectedVar);     // here we are calling the protected class directly without making the object
        protectedMethod();
    }
}
