import java.util.Scanner;

public class Report3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은 ? ");
        String name = keyboard.next();

        System.out.print(name + "님의 가족은 몇 명입니까 ? ");
        int family = keyboard.nextInt();

        System.out.print(name + "님의 가족은 어디에서 살지요 ? ");
        String place = keyboard.next();

        System.out.println();
        System.out.println(name + "님의 가족은 " + family + "명 입니다.");
        System.out.println(name + "님의 가족은 " + place + "에서 살고 있습니다.");
    }
}