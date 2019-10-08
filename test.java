package sk.itsovy.strausz.other;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

    }
//    public void getName() {

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();
//        System.out.println("Username is: " +userName);

//        System.out.println("Enter number ");
//        int value= myObj.nextInt();
//        System.out.println("Your number is " +value);
//
//        int c= value+5;
//
//        for(int i =1; i<=value; i++){
//            System.out.println("*");
//        }

//        String meno="Pato";
//        int heslo = 123456;
//
//        System.out.println("Enter name ");
//        String userName = myObj.nextLine();
//
//        System.out.println("Enter password");
//        int password = myObj.nextInt();
//
//        if(meno.equals(userName) && password == heslo) {
//            System.out.println("Your data was correct .. success");
//        }


//

//

    public void paintRectangle() {

//        Scanner in =new Scanner(System.in);
//        int a=0;
//        int b=0;
//        System.out.println("Input a: ");
//        a = in.nextInt();
//        System.out.println("Input b: " );
//        b= in.nextInt();
//        String s="c";
//        char c=s.charAt(0);
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=b;j++){
//                if(i==1 || i==a || j==1 || j==b){
//                    System.out.print(c +" ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println("  ");
//        }


//        Scanner in =new Scanner(System.in);
//        int a=0;
//        int b=0;
//        System.out.println("Input a: ");
//        a = in.nextInt();
//        System.out.println("Input b: " );
//        b= in.nextInt();
//
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=b;j++){
//                System.out.print("@ ");
//                }
//            System.out.println("  ");
//            }


//        Scanner in =new Scanner(System.in);
//        int a=0;
//        int b=0;
//        System.out.println("Input a: ");
//        a = in.nextInt();
//        System.out.println("Input b: " );
//        b= in.nextInt();
//
//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=b;j++){                           //urobi obdlznik podla hodnot
//                if(i==1 || i==a || j==1 || j==b){
//                    System.out.print("@ ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println("  ");
//        }

//        Scanner month = new Scanner(System.in);
//        int a=0;
//        System.out.println("Enter number of month: ");
//        a = month.nextInt();
//        if(a==1) {
//            System.out.println("January");
//        }
//       else if(a==2){
//            System.out.println("February");
//        }                                                     //mesiace cez if
//        else if(a==3) {
//            System.out.println("March");
//        }
//
//            System.out.println("Error");


//        Scanner month1 = new Scanner(System.in);
//        int month=0;
//        System.out.println("Enter number of month: ");
//        month = month1.nextInt();
//        switch (month){
//            case 1:
//                System.out.println("January");
//                break;                                            // mesiace cez switch
//
//            case 2:
//                System.out.println("February");
//                break;
//
//            case 3:
//                System.out.println("March");
//                break;
//
//            case 4:
//                System.out.println("April");
//                break;
//
//            case 5:
//                System.out.println("May");
//                break;
//
//            case 6:
//                System.out.println("June");
//                break;
//
//            case 7:
//                System.out.println("July");
//                break;
//
//            case 8:
//                System.out.println("August");
//                break;
//
//            case 9:
//                System.out.println("September");
//                break;
//
//            case 10:
//                System.out.println("October");
//                break;
//
//            case 11:
//                System.out.println("November");
//                break;
//
//            case 12:
//                System.out.println("December");
//                break;
//
//                default:
//                    System.out.println("Error");
//        }

//        Scanner m = new Scanner(System.in);
//        int a=0;
//        System.out.println("Enter number: ");
//        a=m.nextInt();
//
//        switch(a){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;                                      //rocne obdobia
//
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//
//                default:
//                    System.out.println("Error");
//
//        }
    }

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










