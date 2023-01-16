public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");
        int fuelType = 95;
        int amount = 50;
        double fuel92price = 60.2;
        double fuel95price = 67.33;
        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        }
        if (fuelType == 95) {
            fuelPrice = fuel95price;
        }
        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");
        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
        if (fuelType > 0) {
        } else {
            System.out.println("Выбран неверный тип топлива");
        }
        if (amount < 1) {
        } else {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }
    }
}