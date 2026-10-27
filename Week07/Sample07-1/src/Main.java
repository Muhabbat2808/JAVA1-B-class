import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int num;
    String result, result1;
    char result2;

    System.out.print("양의 정수 입력 : ");
    num = keyboard.nextInt();

    if (num % 2 == 0) {
        result = String.format("%d는 짝수 입니다.", num);
        result1 = "짝";
        result2 = '짝';
    } else {
        result = String.format("%d는 홀수 입니다.", num);
        result1 = "홀";
        result2 = '홀';
    }

    System.out.println(result);
    System.out.printf("%d는 %s수 입니다.\n", num, result1);
    System.out.printf("%d는 %c수 입니다.\n", num, result2);
}
