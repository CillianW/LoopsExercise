package com.weekThree;

import com.sun.tools.classfile.ConstantPool;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopExercises {

    static Scanner sc;

    public static void main(String[] args) {

        //Part 1
        whileLoop1();

        //Part 2
        whileLoop2();

        //Part 3
        whileLoop3();

        //Part 4
        doWhileLoop1();

        //Part 5
        doWhileLoop2();

        //Part 6
        doWhileLoop3();

        //Part 7
        forLoop1();

        //Part 8
        forLoop2();

        //Part 9
        forLoop3();

        //Part 10
        histogram();
    }

    public static void whileLoop1() {
        int i = 1;
        int n = 5;
        int total = 0;

        while (i <= n) {
            System.out.println("Loop1:i = " + i);
            total = total + i;
            i++;
        }
        System.out.println("Loop1: Total =  " + total);

        System.out.print("\nEnter the increment: ");
        sc = new Scanner(System.in);
        int increment = sc.nextInt();
        i = 1;
        total = 0;

        while (i <= n) {
            System.out.println("Loop1:i = " + i);
            total = total + i;
            i = i + increment;
        }
        System.out.println("Loop2: Total =  " + total);

    }

    public static void whileLoop2() {
        int i = 5;
        int n = 1;
        int total = 0;

        while (i >= n) {
            System.out.println("Loop1:i = " + i);
            total = total + i;
            i--;
        }
        System.out.println("Loop1: Total =  " + total);

        System.out.print("\nEnter the increment: ");
        sc = new Scanner(System.in);

        try {
            int increment = sc.nextInt();

            if (increment < 1) {
                throw new Exception();
            }

            i = 5;
            total = 0;

            while (i >= n) {
                System.out.println("Loop1:i = " + i);
                total = total + i;
                i = i - increment;
            }
            System.out.println("Loop2: Total =  " + total);
        } catch (InputMismatchException e) {
            System.out.println("Please enter an int.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Value must be greater than 0");
            e.printStackTrace();
        }

    }

    public static void whileLoop3() {
        int total = 0;

        System.out.println("Loop 1");
        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            sc = new Scanner(System.in);

            try {
                int x = sc.nextInt();

                if (x == -1) {
                    break;
                }

                total = total + x;
            } catch (InputMismatchException e) {
                System.out.println("Enter an int");
                e.printStackTrace();
            }
        }

        System.out.println("Sum is " + total);

        total = 0;

        System.out.println("\nLoop 2");
        while (true) {
            System.out.print("Enter a number (negative number to exit): ");
            sc = new Scanner(System.in);

            try {
                int x = sc.nextInt();

                if (x < 0) {
                    break;
                }

                total = total + x;
            } catch (InputMismatchException e) {
                System.out.println("Enter an int");
                e.printStackTrace();
            }
        }

        System.out.println("Sum is " + total);
    }

    public static void doWhileLoop1() {
        int i = 1;
        int n = 5;
        int total = 0;

        do {
            System.out.println("Loop1:i = " + i);
            total = total + i;
            i++;
        } while (i <= n);
        System.out.println("Loop1: Total =  " + total);

        System.out.print("\nEnter the increment: ");
        sc = new Scanner(System.in);
        int increment = sc.nextInt();
        i = 1;
        total = 0;

        do {
            System.out.println("Loop1:i = " + i);
            total = total + i;
            i = i + increment;
        } while (i <= n);
        System.out.println("Loop2: Total =  " + total);
    }

    public static void doWhileLoop2() {
        int i = 5;
        int n = 1;
        int total = 0;

        do {
            System.out.println("Loop1:i = " + i);
            total = total + i;
            i--;
        } while (i >= n);
        System.out.println("Loop1: Total =  " + total);

        System.out.print("\nEnter the increment: ");
        sc = new Scanner(System.in);

        try {
            int increment = sc.nextInt();

            if (increment < 1) {
                throw new Exception();
            }

            i = 5;
            total = 0;

            do {
                System.out.println("Loop1:i = " + i);
                total = total + i;
                i = i - increment;
            } while (i >= n);
            System.out.println("Loop2: Total =  " + total);
        } catch (InputMismatchException e) {
            System.out.println("Please enter an int.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Value must be greater than 0");
            e.printStackTrace();
        }
    }

    public static void doWhileLoop3() {
        int total = 0;

        System.out.println("Loop 1");
        do{
            System.out.print("Enter a number (-1 to exit): ");
            sc = new Scanner(System.in);

            try {
                int x = sc.nextInt();

                if (x == -1) {
                    break;
                }

                total = total + x;
            } catch (InputMismatchException e) {
                System.out.println("Enter an int");
                e.printStackTrace();
            }
        }while (true);

        System.out.println("Sum is " + total);

        total = 0;

        System.out.println("\nLoop 2");
        do {
            System.out.print("Enter a number (negative number to exit): ");
            sc = new Scanner(System.in);

            try {
                int x = sc.nextInt();

                if (x < 0) {
                    break;
                }

                total = total + x;
            } catch (InputMismatchException e) {
                System.out.println("Enter an int");
                e.printStackTrace();
            }
        }while(true);
        System.out.println("Sum is " + total);
    }

    public static void forLoop1(){
        int total = 0;

        System.out.println("Loop 1");
        for(int i = 1; i < 21; i++){
            total = total + i;
        }

        System.out.println("Total is " + total);

        total = 0;

        System.out.println("Loop 2");
        for(int i = 5; i < 21; i += 5){
            total = total + i;
        }

        System.out.println("Total is " + total);
    }

    public static void forLoop2(){
        int total = 0;

        System.out.println("Loop 1");
        for(int i = 40; i > 29; i--){
            total = total + i;
        }

        System.out.println("Total is " + total);

        total = 0;

        System.out.println("Loop 2");
        for(int i = 40; i > 29; i -= 5){
            total = total + i;
        }

        System.out.println("Total is " + total);
    }

    public static void forLoop3(){
        int total = 0;

        for(int i = 1; i > 0; i++){
            System.out.print("Enter a number (-1 to exit): ");
            sc = new Scanner(System.in);

            try {
                int x = sc.nextInt();

                if(x == -1){
                    break;
                }

                total = total + x;
            }
            catch (InputMismatchException e){
                e.printStackTrace();
            }
        }
        System.out.println("Total is " + total);
    }

    public static void histogram(){

        try {
            System.out.print("Enter a value for x: ");
            sc = new Scanner(System.in);
            int x = sc.nextInt();

            System.out.print("Enter a value for y: ");
            sc = new Scanner(System.in);
            int y = sc.nextInt();

            System.out.print("Using for loops");
            for(int i = 0; i < x; i ++){
                System.out.println();
                for(int j = 0; j < y; j ++){
                    System.out.print("*");
                }
            }

            System.out.print("\n\nUsing while loops");
            int i = 0;
            int j = 0;
            while(i < x){
                System.out.println();
                while(j < y){
                    System.out.print("*");
                    j++;
                }
                j=0;
                i++;
            }
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
}
