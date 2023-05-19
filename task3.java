import java.util.Scanner;
// Реализовать простой калькулятор

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, res;
        char oper;
        System.out.println("Enter 1st number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        num2 = sc.nextDouble();
        System.out.println("Choose operation ('+', '-', '*', '/'): ");
        oper = sc.next().charAt(0);
        switch(oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("ERROR! Invalid operator");
                return;
        }
        System.out.printf("%.2f\n", res);
    }
}
