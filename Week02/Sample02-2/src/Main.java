public class Report2 {
    public static void main(String[] args) {
        int radius = 5;
        double boxArea = (radius * 2) * (radius * 2);
        double circleArea = radius * radius * 3.141592;
        double area = boxArea - circleArea;

        System.out.println("원의 반지름 : " + radius);
        System.out.println();
        System.out.println("정사각형 면적 : " + boxArea + " Cm2");
        System.out.println("원의 면적 : " + circleArea + " Cm2");
        System.out.println("구하는 면적 : " + area + " Cm2");
    }
}