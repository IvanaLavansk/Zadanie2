public class Main3 {
    public static void main(String[] args) {
        int initialBalance = 300;
        int addend = 800;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
