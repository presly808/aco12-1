package ua.land.mynumber.test;
/*
* Модуль тестирования класса MyNumber
* */

import ua.land.mynumber.model.MyNumber;

public class TestMyNumber {

    public static void main(String[] args) {
        TestMyNumber testnumber = new TestMyNumber();

        System.out.println("\nTest Part 1 ###################################");
        MyNumber  numberOne = new MyNumber(2);
        MyNumber numberTwo = new MyNumber(4);
        testnumber.add(numberOne, numberTwo, 6);
        testnumber.subtract(numberOne, numberTwo, -2);
        testnumber.multiply(numberOne, numberTwo, 8);
        testnumber.divide(numberOne, numberTwo, 0);
        testnumber.pow(numberOne, numberTwo, 16);
        testnumber.factorila(numberOne, 2);
        testnumber.factorila(numberTwo, 24);
        testnumber.remainder(numberOne, numberTwo, 2);
        testnumber.compare(numberOne, numberTwo, false);

        System.out.println("\nTest Part 2 ###################################");
        numberOne = new MyNumber(20);
        numberTwo = new MyNumber(10);
        testnumber.add(numberOne, numberTwo, 30);
        testnumber.subtract(numberOne, numberTwo, 10);
        testnumber.multiply(numberOne, numberTwo, 200);
        testnumber.divide(numberOne, numberTwo, 2);
        testnumber.pow(numberOne, numberTwo, 10_240_000_000_000L);
        testnumber.factorila(numberOne, 2_432_902_008_176_640_000L);
        testnumber.factorila(numberTwo, 3_628_800L);
        testnumber.remainder(numberOne, numberTwo, 0);
        testnumber.compare(numberOne, numberTwo, false);

        System.out.println("\nTest Part 3 ###################################");
        numberOne = new MyNumber(0);
        numberTwo = new MyNumber(10);
        testnumber.add(numberOne, numberTwo, 10);
        testnumber.subtract(numberOne, numberTwo, -10);
        testnumber.multiply(numberOne, numberTwo, 0);
        testnumber.divide(numberOne, numberTwo, 0);
        testnumber.pow(numberOne, numberTwo, 0);
        testnumber.factorila(numberOne, 1);
        testnumber.factorila(numberTwo, 3_628_800L);
        testnumber.remainder(numberOne, numberTwo, 0);
        testnumber.compare(numberOne, numberTwo, false);

        System.out.println("\nTest Part 4 ###################################");
        numberOne = new MyNumber(20);
        numberTwo = new MyNumber(0);
        testnumber.add(numberOne, numberTwo, 20);
        testnumber.subtract(numberOne, numberTwo, 20);
        testnumber.multiply(numberOne, numberTwo, 0);
        testnumber.divide(numberOne, numberTwo, 20);
        testnumber.pow(numberOne, numberTwo, 1);
        testnumber.factorila(numberOne, 2_432_902_008_176_640_000L);
        testnumber.factorila(numberTwo, 1);
        testnumber.remainder(numberOne, numberTwo, 20);
        testnumber.compare(numberOne, numberTwo, false);

        System.out.println("\nTest Part 5 ###################################");
        numberOne = new MyNumber(0);
        numberTwo = new MyNumber(0);
        testnumber.add(numberOne, numberTwo, 0);
        testnumber.subtract(numberOne, numberTwo, 0);
        testnumber.multiply(numberOne, numberTwo, 0);
        testnumber.divide(numberOne, numberTwo, 0);
        testnumber.pow(numberOne, numberTwo, 1);
        testnumber.factorila(numberOne, 1);
        testnumber.remainder(numberOne, numberTwo, 0);
        testnumber.compare(numberOne, numberTwo, true);

    }

    // +
    public boolean add(MyNumber valueOne, MyNumber valueTwo, int expected) {
        MyNumber resultsum = new MyNumber(valueOne.getValue());
        resultsum.add(valueTwo);

        boolean result = (resultsum.getValue() == expected);

        System.out.printf("%s, metod add %s + %s ex. %s return %s\n",
                result, valueOne, valueTwo, expected, resultsum.getValue());

        return result;
    }

    // -
    public boolean subtract(MyNumber minuend, MyNumber subtrahend, int expected) {
        MyNumber resultsubtract = new MyNumber(minuend.getValue());
        resultsubtract.subtract(subtrahend);

        boolean result = (resultsubtract.getValue() == expected);

        System.out.printf("%s, metod subtract %s - %s ex. %s return %s\n",
                result, minuend, subtrahend, expected, resultsubtract.getValue());

        return result;
    }

    // *
    public boolean multiply(MyNumber valueOne, MyNumber valueTwo, int expected) {
        MyNumber resultmultiply = new MyNumber(valueOne.getValue());
        resultmultiply.multiply(valueTwo);

        boolean result = (resultmultiply.getValue() == expected);

        System.out.printf("%s, metod multiply %s * %s ex. %s return %s\n",
                result, valueOne.getValue(), valueTwo.getValue(), expected, resultmultiply.getValue());

        return result;
    }

    // /
    public boolean divide(MyNumber valueOne, MyNumber valueTwo, int expected) {
        MyNumber resultdivide = new MyNumber(valueOne.getValue());
        resultdivide.divide(valueTwo);

        boolean result = (resultdivide.getValue() == expected);

        System.out.printf("%s, metod divide %s / %s ex. %s return %s\n",
                result, valueOne.getValue(), valueTwo.getValue(), expected, resultdivide.getValue());

        return result;
    }

    // x^y
    public boolean pow(MyNumber base, MyNumber exponent, long expected) {
        MyNumber resultpow = new MyNumber(base.getValue());
        resultpow.pow(exponent);

        boolean result = (resultpow.getValue() == expected);

        System.out.printf("%s, metod pow %s ^ %s ex. %s return %s\n",
                result, base.getValue(), exponent.getValue(), expected, resultpow.getValue());

        return result;

    }

    // x!
    public boolean factorila(MyNumber numberOne, long expected) {
        MyNumber resultfactorila = new MyNumber(numberOne.getValue());
        resultfactorila.factorial();

        boolean result = (resultfactorila.getValue() == expected);

        System.out.printf("%s, metod factorila %s ex. %s return %s\n",
                result, numberOne.getValue(), expected, resultfactorila.getValue());

        return result;

    }

    // %
    public boolean remainder(MyNumber dividend, MyNumber divisor, int expected) {
        MyNumber resultremainder = new MyNumber(dividend.getValue());
        resultremainder.remainder(divisor);

        boolean result = (resultremainder.getValue() == expected);

        System.out.printf("%s, metod remainder %s %% %s ex. %s return %s\n",
                result, dividend.getValue(), divisor.getValue(), expected, resultremainder.getValue());

        return result;
    }

    // mynumber.compare
    public boolean compare(MyNumber numberOne, MyNumber numberTwo, boolean expected) {
        boolean resultCompare = numberOne.compare(numberTwo);
        boolean result = (resultCompare == expected);

        System.out.printf("%s, metod compare %s == %s ex. %s return %s\n",
                result, numberOne.getValue(), numberTwo.getValue(), expected, resultCompare);

        return result;

    }


}
