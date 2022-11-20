public class Main {
    public static void main(String[] args) {
        int amount = 1199;
        int score = 0;
        boolean x = true;
        int bonus = amount / 100;


        if (amount >= 1000) {
            System.out.println("Итоговый бонус: " + bonus);
        } else  {
            System.out.println("Итоговый бонус: 0 ");
        }

    }

}