package ua.land.decimal.test;

import ua.land.decimal.model.MyDecimal;


/*
3. Написать класс дробь
        - сложение дробей //sum
        - вычитание //subtract
        - умножение //multiply
        - деление //divide
        - приведение к строке //toString
        - вывод //show
        - метод для сравнения с другой дробью //compare
*/

public class TestMyDecimal {
    public static void main(String[] args) {

        TestMyDecimal testMyDecimal = new TestMyDecimal();

        // 1/2 1/2, 1/2 1/4, 3/2 1/2, 1/2 3/2, 3/2 5/3, 5/3 3/2
        //0/2 1/2, 1/2 0/2, 0/2 0/2, 0/3 0/4, 0/3 1/5, 0/0 1/2, 1/2 0/0, 0/0 0/0
        System.out.println(" Test №1 My Decimal #############################");
        MyDecimal decimalOne = new MyDecimal(2,4);
        MyDecimal decimalTwo = new MyDecimal(4,8);

        testMyDecimal.sum(decimalOne, decimalTwo, new MyDecimal() );
        testMyDecimal.subtract(decimalOne, decimalTwo, new MyDecimal()  );
        testMyDecimal.multiply(decimalOne, decimalTwo,new MyDecimal()  );
        testMyDecimal.divide(decimalOne, decimalTwo,new MyDecimal()  );
        testMyDecimal.toString( decimalOne );
        testMyDecimal.toString( decimalTwo );
        testMyDecimal.show( decimalOne );
        testMyDecimal.show( decimalTwo );
        testMyDecimal.compare( decimalOne, decimalTwo, false );
        testMyDecimal.compare( decimalTwo, decimalOne, false );


        System.out.println(" Test №2 My Decimal #############################");
        System.out.println(" Test №3 My Decimal #############################");
        System.out.println(" Test №4 My Decimal #############################");
        System.out.println(" Test №5 My Decimal #############################");



    }



}


