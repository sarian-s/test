public class ghgggf {
    public static void main(String[] args) {
        int invoiceAmount = 1000;

        int putAmount = 1001;

        int bonusToRub = 100;

        int bonus = putAmount > 1000 ? putAmount / bonusToRub : 0;

        System.out.println("Пополнение счета на  " + putAmount);

        System.out.println("Начисленные бонусы " + bonus);

        System.out.println("Итоговая сумма на счету " + (invoiceAmount + putAmount + bonus));
        /*
        if (putAmount > 1000) {
            System.out.println("итоговая сумма на счету " + (invoiceAmount + putAmount + bonus));
        } else {
            System.out.println("итоговая сумма на счету " + (invoiceAmount + putAmount + 0));
        }
        */
    }
}
