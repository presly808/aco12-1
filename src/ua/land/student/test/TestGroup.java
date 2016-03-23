package ua.land.student.test;
/*
 * Класс написанный преподователем на уроке
 */


import ua.land.student.model.*;
import ua.land.student.util.*;

/**
 * TDD
 */
public class TestGroup {


    public static void main(String[] args) {
        MyGroup myGroup = new MyGroup("ACO12");
        Student student = StudentUtils.generateStudent();


        boolean expected = true;
        boolean practical = myGroup.addStudent(student);
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                expected == practical, "addStudent", expected, practical);


        Student student1 = myGroup.get(0);
        System.out.printf("res %s, method %s, ex %s = practical %s\n", student1 == student , "get", student,
                student1 != null ? student1 : "null");
    }


    // positive
    public static void testAddStudent(){

    }

    // pass null to addStudent
    public static void testAddStudentWithNull(){

    }
}
