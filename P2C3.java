package com.demo.packages.p2;

import com.demo.packages.p1.P1C1;
import com.demo.packages.p1.P1C3;

public class P2C3 extends P1C3 {
    public static void main(String[] args) {
        P1C3 p1c3 = new P1C3();
        p1c3.testAccess();
    }
        public void testAcess(){
            P1C1 p1c1=new P1C1();
//            System.out.println(p1c1.packagePrivateVar);
//            p1c1.packagePrivateMethod();
//
//            System.out.println(p1c1.protectedVar + " by creating an object of P1C1");
//            p1c1.protectedMethod();
            // these two won't work

            System.out.println(protectedVar+" by inheritance");
            protectedMethod();

        }

    }

