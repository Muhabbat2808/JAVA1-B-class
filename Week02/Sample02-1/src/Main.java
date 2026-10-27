import java.util.Scanner;
import java.util.Locale;

public class Report1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);

        System.out.print("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요\n");
        int age = keyboard.nextInt();
        double weight = keyboard.nextDouble();
        double height = keyboard.nextDouble();

        System.out.println();
        System.out.println("당신의 나이는 " + age + "살 입니다.");
        System.out.println("당신의 체중은 " + weight + "kg 입니다.");
        System.out.println("당신의 신장은 " + height + "cm 입니다.");
    }
}