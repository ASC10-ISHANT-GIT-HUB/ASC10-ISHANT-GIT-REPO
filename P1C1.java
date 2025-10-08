package com.demo.packages.p1;

public class P1C1 {

        private String privateVar = "private variable";
        private void privateMethod(){
            System.out.println("Private Method");
        }

        // package protected doesn't have any keyword that's why there is nothing before the String
        String packagePrivateVar = "Package-Private variable";
        void packagePrivateMethod(){
        System.out.println("Package-Private Method");
        }

        protected String protectedVar = "Protected variable";
        protected void protectedMethod(){
        System.out.println("Protected Method");
        }

        public String publicVar = "Public variable";
        public void publicMethod(){
        System.out.println("Public Method");
        }

        public static void main(String[] args) {
            //private
            P1C1 p1c1 = new P1C1();
            System.out.println(p1c1.privateVar);  // if you write System.err.println(); then it will give output but if there is any error in method it will mark red in color which denotes that it may contains some error
            p1c1.privateMethod();
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
