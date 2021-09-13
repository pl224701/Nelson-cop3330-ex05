/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the first number? ");
        String str1=sc.nextLine();
        System.out.print("What is the second number? ");
        String str2=sc.nextLine();
        int n1=Integer.parseInt(str1);
        int n2=Integer.parseInt(str2);
        int n3=n1+n2;
        int n4=n1-n2;
        int n5=n1*n2;
        int n6=n1/n2;
        System.out.printf("%d + %d = %d\n",n1,n2,n3);
        System.out.printf("%d - %d = %d\n",n1,n2,n4);
        System.out.printf("%d * %d = %d\n",n1,n2,n5);
        System.out.printf("%d / %d = %d",n1,n2,n6);
    }
}