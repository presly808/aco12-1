package ua.land.student.util;



import java.util.Scanner;

public class MyStudentUtils {

    public static void workWithStudent() {
        Scanner scIn = new Scanner(System.in);
        while (true) {

            System.out.println("Enter you choice");
            System.out.println("1 Create Student");
            System.out.println("2 Delete Student");
            System.out.println("3 Sarch Student");
            System.out.println("4 Show All");
            System.out.println("5 Exit");

            switch (scIn.nextInt()) {
                case 1:
                    System.out.print("Enter Sudent Name:");
                    String name = scIn.next();
                    System.out.print("Enter Sudent phone:");
                    String phone = scIn.next();
                    System.out.print("Enter Sudent email:");
                    String email = scIn.next();
                    System.out.print("Enter Sudent paidMoney:");
                    double paidMoney = scIn.nextDouble();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
//                    break;
            }
        }


    }


}
