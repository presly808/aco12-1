package ua.land.mynumber.util;

import ua.land.mynumber.model.MyNumber;


public class NumberUtil {

    public static boolean checkIsNull(MyNumber value) throws NullPointerException  {
        try {
            if (value == null) {
                throw new NullPointerException("null");
            }
        }  catch (NullPointerException ex) {
            System.out.println("Переменная не инициализирована");
            return true;
        }
        return false;
    }

    public static void checkIsZero(MyNumber value) throws ArithmeticException {
        if (value.getValue() == 0) {
            throw new ArithmeticException("значение = 0");

        }
    }
}
