void main() {
    Scanner keyboard = new Scanner(System.in);
    final int LIFE = 7;        // 담배 1개피당 수명 단축 (분)
    final int DAYS = 365;      // 1년은 365일
    final int CASE = 20;       // 담배 1갑 = 20개피
    final int PRICE = 4500;    // 담배 1갑 가격 (원)

    System.out.print("당신은 몇년간 담배를 피웠나요 ? ");
    int year = keyboard.nextInt();
    System.out.print("하루에 몇 개피를 피우나요 ? ");
    int ciga = keyboard.nextInt();

    System.out.printf("담배 1개피를 피우면 수명이 %d분 단축 된다고 합니다.\n", LIFE);

    long piece = (long) year * DAYS * ciga;            // 피운 총 개피 수
    long minute = piece * LIFE;                        // 단축된 수명 (분)

    long day = minute / (24 * 60);
    int lossYear = (int) (day / DAYS);
    int lossDay = (int) (day % DAYS);
    int lossHour = (int) (minute % (24 * 60) / 60);
    int lossMinute = (int) (minute % 60);

    long box = (piece + CASE - 1) / CASE;              // 갑 단위로 구매 (올림)
    long money = box * PRICE;

    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, %,d분 수명이 단축됩니다.\n",
            year, ciga, minute);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, %d년 %d일 %d시간 %d분 수명이 단축됩니다.\n",
            year, ciga, lossYear, lossDay, lossHour, lossMinute);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, 담배 금액은 %,d 원 입니다.\n",
            year, ciga, money);
}