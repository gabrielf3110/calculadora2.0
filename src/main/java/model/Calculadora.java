package model;

import java.util.Arrays;

public class Calculadora {

    public Double calcular(String op, double x, double y) {
        switch (op) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                System.out.println("Opção invalida!");
        }
        return null;
    }
}
