import java.util.Scanner;

public class Report2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = keyboard.nextInt();

        System.out.println();
        if (score < 0 || score > 100) {
            System.out.println("오류 : 점수는 0 ~ 100 사이여야 합니다.");
        } else {
            String grade;
            if (score < 60) {
                grade = "F";
            } else {
                int level = (Math.min(score, 99) - 60) / 5;
                char letter = (char) ('D' - level / 2);
                String suffix = (level % 2 == 1) ? "+" : "0";
                grade = letter + suffix;
            }
            System.out.println("입력 점수 : " + score);
            System.out.println("학점 : " + grade);
        }

        keyboard.close();
    }
}