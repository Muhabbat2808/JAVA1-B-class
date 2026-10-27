import java.util.Scanner;

class Report2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width, length, height, vol;

        System.out.print("직육면체 가로 세로 높이 입력 : ");
        width = keyboard.nextInt();
        length = keyboard.nextInt();
        height = keyboard.nextInt();

        vol = width * length * height;

        System.out.println("직육면체 가로 = " + width + " Cm");
        System.out.println("직육면체 세로 = " + length + " Cm");
        System.out.println("직육면체 높이 = " + height + " Cm");
        System.out.println("직육면체 부피 = " + vol + " Cm");
    }
}