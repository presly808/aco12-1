package ua.land.mynumber.model;
//???????????????????????????????
//Как запретить менять значения аргумента если это обьект?
//Как сравнивать результаты если ожидается возвращение exeption
//protected

/*Написать класс число.
        - сложение
        - вычитание
        - умножение
        - деление
        - возведение в степень
        - вычисление факториала
        - вычисление остатка от деления
        - метод который сравнивает два числа*/

import ua.land.mynumber.util.NumberUtil;

public class MyNumber {
    private long value;

    public MyNumber(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public MyNumber add(MyNumber numberTwo) {
//        NumberUtil.checkIsNull(numberTwo); //как обрабатывать

        if (NumberUtil.checkIsNull(numberTwo)) {

        } else {
            this.setValue(this.getValue() + numberTwo.getValue());

        }
        return this;
    }

    public MyNumber subtract(MyNumber subtrahend) {
        if (NumberUtil.checkIsNull(subtrahend)) {

        } else {
            this.setValue(this.getValue() - subtrahend.getValue());
        }
        return this;
    }

    @Override
    public String toString() {
        return " " + this.getValue() + " ";
    }

    public MyNumber multiply(MyNumber value) {
        if (NumberUtil.checkIsNull(value)) {

        } else {
            this.setValue(this.getValue() * value.getValue());
        }

        return this;
    }

    public MyNumber divide(MyNumber value) {
        if (NumberUtil.checkIsNull(value)) {

        } else {
            try {
                NumberUtil.checkIsZero(value);
            } catch (ArithmeticException ex) {
                System.out.println("Нельзя делить на 0, / by zero");
                return this;
            }
            this.setValue(this.getValue() / value.getValue());

        }
        return this;
    }


    public MyNumber pow(MyNumber exponent) {
        if (NumberUtil.checkIsNull(exponent)) {

        } else {
            long result = (long) Math.pow(getValue(), exponent.getValue());
            this.setValue(result);
        }

        return this;
    }

    public MyNumber factorial() {

        if (this.getValue() == 0) {
            this.setValue(1);
            return this;
        }
        if (this.getValue() == 1) {
            this.setValue(1);
            return this;
            //??? return this.setValue(1);
        }

        long result = this.getValue() * ((new MyNumber(this.getValue() - 1)).factorial()).getValue();
        this.setValue(result);
        return (this);
    }

    public MyNumber remainder(MyNumber divisor) {
        if (NumberUtil.checkIsNull(divisor)) {

        } else {
            try {
                NumberUtil.checkIsZero(divisor);
            } catch (ArithmeticException ex) {
                System.out.println("Нельзя делить на 0, / by zero");
                return this;
            }

            this.setValue(this.getValue() % divisor.getValue());
        }

        return this;
    }

    public boolean compare(MyNumber numberTwo) {
        if (NumberUtil.checkIsNull(numberTwo)) {
            return false;
        } else {
            return this.getValue() == numberTwo.getValue();
        }

    }
}
