import model.Calculadora;

import java.util.Scanner;

public class Main {

    static Calculadora c = new Calculadora();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação: ");
        String op = sc.nextLine();
        System.out.println("Digite o primeiro número:");
        double x = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        double y = sc.nextDouble();
        //100*5
        System.out.println("Digite o calculo: ");
        String calculo = sc.nextLine();
        String[] calculoString = {"x"};

        //while(calculoString.length == 1) {
        //    calculoString = calculo.split("\\s*\\*\\s*");
        //    if(calculoString.length == 2) {
        //        op = "*";
        //        x = Double.parseDouble(calculoString[0]);
        //        y = Double.parseDouble(calculoString[1]);
        //        break;
        //    }
        //    calculoString = calculo.split("\\s*\\-\\s*");
        //    if(calculoString.length == 2) {
        //        op = "-";
        //        x = Double.parseDouble(calculoString[0]);
        //        y = Double.parseDouble(calculoString[1]);
        //        break;
        //    }
        //    //calculoString = calculo.split("\\s*/\\s*");
        //    //if(calculoString.length == 2) {
        //        op = "/";
        //        x = Double.parseDouble(calculoString[0]);
        //        y = Double.parseDouble(calculoString[1]);
        //        break;
        //    }
        //    calculoString = calculo.split("\\s*\\+\\s*");
        //    if(calculoString.length == 2) {
        //        op = "+";
        //        x = Double.parseDouble(calculoString[0]);
        //        y = Double.parseDouble(calculoString[1]);
        //        break;
        //    }
        //}
        double resultado = c.calcular(op, x, y);
        System.out.println("O resultado de " + x + " " + op + " " + y + " é: " + resultado);
    }
}
