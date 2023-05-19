import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n),  
// n! (произведение чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Сумма от 1 до " + n + " = " + getSum(n));
        System.out.println(n + "! = " + getFact(n));
    }

    public static int getSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += n;
        }
        return result;
    }

    public static int getFact(int n) {
        int result = 1;
        for (int i = 1; i<= n; i++) {
            result *= i;
        }
        return result;
    }

}

