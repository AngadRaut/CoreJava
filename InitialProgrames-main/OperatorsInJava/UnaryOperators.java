package OperatorsInJava;

import java.awt.color.ICC_ColorSpace;

public class UnaryOperators {
    public static void main(String[] args){
        int a=10;
        System.out.println("pre increment is ="+(++a));//11
        System.out.println("pre increment is ="+(a++));//11
        System.out.println("pre increment is ="+(a++));//12
        System.out.println("pre increment is ="+(a++));//13
        System.out.println("pre increment is ="+(--a));//13
        System.out.println("pre increment is ="+(--a));//12
    }
}
