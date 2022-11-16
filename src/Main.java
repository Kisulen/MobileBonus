public class Main {
    public static void main(String[] args) {

        int before = 400;
        int topUp = 1037;

        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        int after = bonus + before + topUp;

        System.out.println("Начисленные бонусы: " + bonus);
        System.out.println("Остаток на счёте: " + after);

    }
}
