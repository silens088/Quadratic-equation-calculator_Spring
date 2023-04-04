package patternRegexp;

public class PatternRegexp {

    public static final String patternEquation = "(((-|\\+)?(\\d+(?:[\\.,]\\d+)?))x\\^2((-|\\+){1}(\\d+(?:[\\.,]\\d+|)?))x((-|\\+){1}(\\d+(?:[\\.,]\\d+|)?))=0){1}";
}

/*
    Уравнение без автоматитеского экранирования джавы.
        ((((-|\+)?)(\d+(?:[\.,]\d+)?)x\^2)(((-|\+){1}(\d+(?:[\.,]\d+|)?))x)((-|\+){1}(\d+(?:[\.,]\d+|)?))=0){1}

    Синтаксис регексп.
        {1} -не менее 1 раза.
        + -один или более
        | - или
        ? - ноль или одно
        * -ноль или более
        ^ - начало строки
        [0-9]* - 0 и более цифр
        [.,] - точка или запятая
        [,.]? - одна или ноль запятых или точек
        [0-9]+ - 1 и более цифр
        $ - конец строки.

    Примеры уравнений.
        0 roots
        4x^2+2x+1=0
        1 roots
        1x^2-6x+9=0
        2 roots
        4x^2+2x-1=0

    //приверы ранее использованных выражений.
    //public static final String patternEquation = "((((-|\\+)?)(\\d+(?:[\\.,]\\d+)?)x\\^2)(((-|\\+){1}(\\d+(?:[\\.,]\\d+|)?))x)((-|\\+){1}(\\d+(?:[\\.,]\\d+|)?))=0){1}";
    // 11 public static final String patternEquation = "(((-|\+)?(\d+(?:[\.,]\d+)?))x\^2((-|\+){1}(\d+(?:[\.,]\d+|)?))x((-|\+){1}(\d+(?:[\.,]\d+|)?))=0){1}";
*/