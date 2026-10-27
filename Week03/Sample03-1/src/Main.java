import java.util.Scanner;

class Report1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        sc.close();
    }
}