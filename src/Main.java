public class Main {
    public static void main(String[] args) {
        int accountBalance = 500;
        int replenishment = 1500;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;

        } else {
            bonus = 0;
        }
        int total = accountBalance + replenishment + bonus;
        System.out.println("Итого на балансе" + total);
        System.out.println("Бонус" + bonus);
    }
}
