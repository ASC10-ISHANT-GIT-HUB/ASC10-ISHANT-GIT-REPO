package com.demo.funda;

public class WrapperTypes {
    public static void main(String[] args) {
        
    
    float floatPrimitive = 10.5f;
    Float floatObj = Float.valueOf(floatPrimitive);
    System.out.println("Float value: "+floatObj);
    float nanValue=0.0f/0.0f;
    Float nanObj = Float.valueOf(nanValue);

    System.out.println("isNan: "+floatObj.isNaN());
    System.out.println("isNan (Nan value): "+nanObj.isNaN());
    //other mehtods
    System.out.println("isInfinite: "+floatObj.isInfinite());
    System.out.println("toString: "+floatObj.toString());
    System.out.println("hashcode: "+floatObj.hashCode());
    System.out.println("compareTo (with 10.5f): "+floatObj.compareTo(10.5f));
    System.out.println("compareTo (with 20.5f): "+floatObj.compareTo(20.5f));
    System.out.println("compareTo (with 20.5f): "+floatObj.compareTo(5.5f));
    System.out.println("equals (with 10.5f): "+floatObj.equals(10.5f));

    Float anotherFloatObj = Float.valueOf(20.5f);
        System.out.println("Difference between two float values: "+(anotherFloatObj-floatObj));

    }
}
