public class Main {
    public static void main(String[] args) {
        int amount = 1100;
        int score = 100;


        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / 100;
        }
            int finalamount = amount + score + bonus;

            System.out.println("Итоговый счет: " + finalamount);
            System.out.println("Бонус: " + bonus);
        }

    }

