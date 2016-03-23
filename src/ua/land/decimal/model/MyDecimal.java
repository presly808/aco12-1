package ua.land.decimal.model;

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

import ua.land.mynumber.model.MyNumber;

public class MyDecimal {

    //    private int dividend;
    //    private int divisor;
    private MyNumber dividend;
    private MyNumber divisor;


    public MyDecimal() {
        this(1, 1);
    }

    public MyDecimal(long dividend, long divisor) {
        //TODO проверку на divisor 0
        this.dividend = new MyNumber(dividend);
        this.divisor = new MyNumber(divisor);
    }

    public long getDividend() {
        return dividend.getValue();
    }

    public void setDividend(int dividend) {
        this.setDividend((long) dividend);
    }

    public void setDividend(long dividend) {
        this.dividend.setValue(dividend);
    }

    public long getDivisor() {
        return divisor.getValue();
    }

    public void setDivisor(int divisor) {
        this.setDivisor((long) divisor);
    }

    public void setDivisor(long divisor) {
        //TODO проверку на 0
        this.divisor.setValue(divisor);
    }
}
