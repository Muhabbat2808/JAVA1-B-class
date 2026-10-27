import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2;
    float result;
    String message;

    System.out.print("분자 입력 : ");
    num1 = keyboard.nextInt();
    System.out.print("분모 입력 : ");
    num2 = keyboard.nextInt();

    result = (float) num1 / num2;

    if (num2 == 0) {
        message = "계산할 수 없음";
    } else {
        message = String.format("%d / %d = %.2f", num1, num2, result);
    }

    System.out.println(message);
}