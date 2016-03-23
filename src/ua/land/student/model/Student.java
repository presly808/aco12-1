package ua.land.student.model;

public class Student {

    // fields, properties
    // has-a
    private String name;
    private String phone;
    private String email = "none";

    private double paidMoney;

    private MyDate myDate; //

    private Address address;

    public Student(String name, String phone, String email, double paidMoney, MyDate myDate, Address address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.myDate = myDate;
        this.address = address;
        this.paidMoney = paidMoney;
    }

       @Override
    public String toString() {
        //return super.toString();
           return String.format("Name: %s \nPhone: %s \ne-mail: %s \nPaid Money: %.2f",
                   name, phone, email, paidMoney) + myDate +
                   address;

    }
}