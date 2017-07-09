package simpleFactoryPattern.pro.v2;

import java.util.Scanner;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/6/26 22:47
 * @return ${return_type}
 * @since simpleFactoryPattern.pro.v1.0.0
 * ${tags}
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("请输入数字A: ");
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        System.out.print(A);
        System.out.println();

        System.out.println("请选择运算符号(+、-、*、/): ");
        String B = scanner.nextLine();
        System.out.print(B);
        System.out.println();

        System.out.println("请输入数字C: ");
        String C = scanner.nextLine();
        System.out.println(C);
        System.out.println();

        String D = "";

        switch (B) {
            case "+":
                D = String.valueOf(Integer.parseInt(A)+Integer.parseInt(C));
                break;
            case "-":
                D = String.valueOf(Integer.parseInt(A)-Integer.parseInt(C));
                break;
            case "*":
                D = String.valueOf(Integer.parseInt(A)*Integer.parseInt(C));
                break;
            case "/":
                D = String.valueOf(Integer.parseInt(A)/Integer.parseInt(C));
                break;
            default:
                break;
        }

        System.out.println("D:"+D);

    }
}
