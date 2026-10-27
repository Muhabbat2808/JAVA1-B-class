import java.util.Scanner;

public class Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("정수 3개 입력 : ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        boolean hasNegative = a < 0 || b < 0 || c < 0;
        boolean allPositive = a > 0 && b > 0 && c > 0;
        boolean allZero = a == 0 && b == 0 && c == 0;

        if (hasNegative) {
            System.out.println("음수 포함");
        } else if (allPositive) {
            System.out.println("모두 양수");
        } else if (allZero) {
            System.out.println("모두 0");
        } else {
            System.out.println("음수 없음(0 포함)");
        }

        keyboard.close();
    }
}