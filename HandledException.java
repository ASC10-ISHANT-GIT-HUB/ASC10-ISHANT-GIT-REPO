package com.demo.exceptions;

public class HandledException {
   public  HandledException(){
       result=0;
   }

    int result; // it becomes instance variables
    private void Test() {
//        int result=0;
        try{
            int i=100;
            System.out.println("divide by zero");
            result=i/0;
        }
        catch(Exception e){
            System.out.println("exception occured: "+e);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        HandledException he = new HandledException();
        he.Test();
    }
}