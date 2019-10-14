package sk.itsovy.strausz.other;

import java.util.Random;
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

//    public void paintRectangle() {

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

//    public void quadraticEqual() {
//        System.out.println("Hi Im program to solve quadratic equation");
//
//    Scanner m = new Scanner(System.in);
//    double a;
//    double b;
//    double c;
//    System.out.println("A = ");
//    a = m.nextDouble();
//    System.out.println("B = ");
//    b = m.nextDouble();
//    System.out.println("C = ");
//    c = m.nextDouble();
//                                                                    //kvadraticka rovnica
//        double D=0, x1=0, x2=0;
//        if (a==0){
//            System.out.println("Is not quadratic equation");
//        }else{
//            D=b*b-4*a*c;
//            System.out.println("D = "+ D);
//            if (D<0)
//                System.out.println("Equation has no root");
//            else if (D==0) {
//                x1=-b/2*a;
//                System.out.println("Root: "+x1);
//            }else if (D>0){
//                x1=(-b+Math.sqrt(D))/(2*a);
//                x2=(-b-Math.sqrt(D))/(2*a);
//                System.out.println("Root 1: "+x1);
//                System.out.println("Root 2: "+x2);
//            }
//        }
//    }


//    public void paintPyramid() {
//        Scanner scanner = new Scanner(System.in);
//        int n;
//        System.out.println("Enter number of rows: ");
//        n = scanner.nextInt();
//
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 20; j >= i; j--) {
//                System.out.print("  ");
//
//            }                                              //obratena pyramida
//
//            for (int k = 1; k <= (i * 2 - 1); k++) {
//                System.out.print("% ");
//            }
//            System.out.println("  ");
//
//        }
//
//        scanner.close();
//
//    }


//    public void randomNumber() {
//        Random rnd = new Random();
//       int a= rnd.nextInt(6)+1;
//        System.out.println(a);
//        a= rnd.nextInt(6)+1;                   //nahodne cisla z rozsahu 1 - 5
//        System.out.println(a);                    // +1 = zacina od "1"
//       a=  rnd.nextInt(6)+1;
//        System.out.println(a);
//
//    }


//    public void randomNumber() {
//        Random rnd = new Random();
//       int  a = rnd.nextInt(6) + 1;
//        int b;
//        int c;
//        do {
//            b = rnd.nextInt(6) + 1;                        //nahodne cisla ktore sa nemozu opakovat zacinajuce od 1
//
//
//        } while (a == b);
//
//        do {
//            c = rnd.nextInt(6) + 1;
//        } while (c == a || c == b);
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }


//    public void randomNumber() {
//        Random rnd = new Random();
//        int a = rnd.nextInt(26)+97;             // <97;122>
//     System.out.println(a);
//
//     int b= rnd.nextInt(10)+48;                 // <48;57>
//     System.out.println(b);
//
//     int c =rnd.nextInt(101)+100;               //<100;200>
//     System.out.println(c);
//
//     int d = rnd.nextInt(21)-10;                //<-10;10>
//     System.out.println(d);
//
//     int e = rnd.nextInt(4)-1;                 //<-1;2>
//     System.out.println(e);
//
//     int f = rnd.nextInt(503)+113;              //<113;615>
//     System.out.println(f);

//     int a= 5* (rnd.nextInt(10)+1);      //nasobok cisla 5
//     System.out.println(a);
//
//
//     int b=  2* (rnd.nextInt(45)+5);   //parne dvojciferne
//     System.out.println(b);
//
//     int c = 2* (rnd.nextInt(45)+5)+1;  //neparne dvojciferne
//     System.out.println(c);

//     int g = 11* (rnd.nextInt(81)+10);    //trojciferne cisla delitelne 11
//     System.out.println(g);

//        int prime;
//        int div;
//        do {
//            prime = rnd.nextInt(4500) + 500;
//            prime = 2 * prime + 1;
//            div = 0;
//            for (int i = 2; i <= Math.sqrt(prime); i++) {
//                if (prime % i == 0) {
//                    div++;
//                }
//            }
//        } while (div > 0);                                                     //vypise stvorciferne prvocislo
//        System.out.println(prime);


//        String password= "";
//        for(int l=0; l<6; l++) {
//            int num = rnd.nextInt(26) + 65;          //nahodne heslo
//            char letter = (char) num;
//            password= password +  letter;
//        }
//        System.out.println(password);
//    }


//        String password = "";
//        for (int l = 0; l < 5; l++) {
//            int num = rnd.nextInt(26) + 65;
//            char letter = (char) num;
//            password = password + letter;
//        }                                              //nahodne heslo velke + male pismena + cisla
//        for (int m = 0; m < 5; m++) {
//            int num = rnd.nextInt(26) + 97;
//            char letter = (char) num;
//            password = password + letter;
//        }
//        for (int p = 0; p < 5; p++) {
//            int num = rnd.nextInt(10) + 48;
//            char letter = (char) num;
//            password = password + letter;
//        }
//
//        System.out.println(password);


    // }

//    /**
//     * @author Patrik Strausz
//     * @date 11.10.2019
//     * @param n length of the password
//     * @param rules if true, then 6<length<31, min at least one digit, upper, lower letter
//     * @description this method generates a random password
//     * @return
//     */
//
//    public String generatePassword(int n, boolean rules){
//        if(rules==true && (n<6 || n>30) )  // kontrola dlzky hesla
//            n = 10;
//
//        String passwd="";
//        int count=0;
//        int digits=0;
//        int upper=0;
//        int lower=0;
//        if(rules==false){
//            digits=upper=lower=1;
//        }
//        int num=0;
//        Random rnd=new Random();
//        do{
//            int type=rnd.nextInt(3);
//            switch(type){
//                case 0: num=rnd.nextInt(10)+'0'; digits++; break;
//                case 1: num=rnd.nextInt(26)+'A'; upper++; break;
//                case 2: num=rnd.nextInt(26)+'a'; lower++; break;
//            }
//            char c=(char)num;
//            passwd+=c;
//            count++;
//            if(count==n && (digits==0 || upper==0 || lower==0)){
//                count=digits=upper=lower=0;
//                passwd="";
//            }
//
//        } while(count<n);
//
//        return passwd;
//    }















