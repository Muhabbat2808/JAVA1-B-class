public class Report0 {
    public static void main(String[] args) {
        int i = 12, j = 4;
        int age = 8, b = 10, c = 5;
        char lower = 'k';
        char ch = 'Q';
        int year = 2024;
        boolean powerOn = false;
        String str = "yes";

        boolean r1 = i % j == 0;
        boolean r2 = age <= 12;
        boolean r3 = age < b && age > c;
        boolean r4 = age - 5 == 10;
        boolean r5 = age != b || age == c;
        boolean r6 = lower >= 'a' && lower <= 'z';
        boolean r7 = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        boolean r8 = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        boolean r9 = !powerOn;
        boolean r10 = str.equals("yes");

        System.out.println(" 1. i % j == 0 -> " + r1);
        System.out.println(" 2. age <= 12 -> " + r2);
        System.out.println(" 3. age < b && age > c -> " + r3);
        System.out.println(" 4. age - 5 == 10 -> " + r4);
        System.out.println(" 5. age != b || age == c -> " + r5);
        System.out.println(" 6. c >= 'a' && c <= 'z' -> " + r6);
        System.out.println(" 7. (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') -> " + r7);
        System.out.println(" 8. year%400==0 || (year%4==0 && year%100!=0) -> " + r8);
        System.out.println(" 9. !powerOn -> " + r9);
        System.out.println("10. str.equals(\"yes\") -> " + r10);
    }
}