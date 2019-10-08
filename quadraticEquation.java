package sk.itsovy.strausz.other;

import java.util.Scanner;

public class quadraticEquation {
    public void quadraticEqual() {
        System.out.println("Hi Im program to solve quadratic equation");

        Scanner m = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("A = ");
        a = m.nextDouble();
        System.out.println("B = ");
        b = m.nextDouble();
        System.out.println("C = ");
        c = m.nextDouble();
        //kvadraticka rovnica
        double D=0, x1=0, x2=0;
        if (a==0){
            System.out.println("Is not quadratic equation");
        }else{
            D=b*b-4*a*c;
            System.out.println("D = "+ D);
            if (D<0)
                System.out.println("Equation has no root");
            else if (D==0) {
                x1=-b/2*a;
                System.out.println("Root: "+x1);
            }else if (D>0){
                x1=(-b+Math.sqrt(D))/(2*a);
                x2=(-b-Math.sqrt(D))/(2*a);
                System.out.println("Root 1: "+x1);
                System.out.println("Root 2: "+x2);
            }
        }
    }
}
