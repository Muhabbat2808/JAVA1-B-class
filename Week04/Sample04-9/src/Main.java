import java.util.Scanner;void main() { Scanner keyboard = new Scanner(System.in); int base; int height; double area;
    System.out.print("삼각형의 밑변은 ? ");
    base = keyboard.nextInt();
    System.out.print("삼각형의 높이는 ? ");
    height = keyboard.nextInt();

    area = (base * height) / 2.0;

    System.out.printf("\n\t**** 삼각형의 넓이 구하기 ****\n");
    System.out.printf("\t\t밑변 : %d Cm\n", base);
    System.out.printf("\t\t높이 : %d Cm\n", height);
    System.out.printf("\t\t넓이 : %.1f Cm²\n", area);
}