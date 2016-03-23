package ua.land.student.test;


import ua.land.student.model.*;
import ua.land.student.util.*;

public class TestStudent {
    // psvm
    public static void main(String[] args) {

        // create instance(initialize all fields),
        // allocate memory for student

        Address address = new Address("Kiev","Universitet","33");
        MyDate myDate = MyDate.init(1990,10,10);

        Student student1 = new Student("Oleg","+38067","o@student.ua",90.99, myDate, address);

       // System.out.println(myDate.getBirthYear());

        System.out.println(student1);

        MyStudentUtils.workWithStudent();

    }


}
