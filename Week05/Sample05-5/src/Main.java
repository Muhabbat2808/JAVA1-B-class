import java.util.Scanner;

public class Report4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("구매 금액 입력 (원) : ");
        int amount = keyboard.nextInt();
        System.out.print("멤버십 회원입니까? (true/false) : ");
        boolean isMember = keyboard.nextBoolean();

        System.out.println();
        if (amount < 0) {
            System.out.println("오류 : 구매 금액은 음수일 수 없습니다.");
        } else {
            boolean freeShipping = amount >= 50000 || (isMember && amount >= 30000);
            System.out.println("구매 금액 : " + amount + "원, 멤버십 : " + isMember);
            System.out.println(freeShipping ? "무료배송 적용" : "무료배송 아님 (배송비 부과)");
        }

        keyboard.close();
    }
}