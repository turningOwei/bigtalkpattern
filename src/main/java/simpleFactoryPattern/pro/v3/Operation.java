package simpleFactoryPattern.pro.v3;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/26 23:07
 * @return ${return_type}
 * @since simpleFactoryPattern.pro.v1.0.0
 * ${tags}
 */
public class Operation {
    public static String getResult(double numberA,double numberB,String operate){
        String res = "";
        switch (operate){
            case "+":
                res = String.valueOf(numberA + numberB);
                break;
            case "-":
                res = String.valueOf(numberA - numberB);
                break;
            case "*":
                res = String.valueOf(numberA * numberB);
                break;
            case "/":
                res = String.valueOf(numberA / numberB);
                break;
            default:
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("请输入数字A: ");
        Scanner scanner = new Scanner(System.in);
        double A = Double.parseDouble(scanner.nextLine());
        System.out.print(A);
        System.out.println();

        System.out.println("请选择运算符号(+、-、*、/): ");
        String B = scanner.nextLine();
        System.out.print(B);
        System.out.println();

        System.out.println("请输入数字C: ");
        double C = Double.parseDouble(scanner.nextLine());
        System.out.println(C);
        System.out.println();

        String res = Operation.getResult(A,C,B);
        System.out.println(res);
    }
}
