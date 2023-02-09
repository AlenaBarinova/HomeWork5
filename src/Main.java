public class Main {
    public static void main(String[] args) {

        int ios = 1;
        if (ios == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        /*Task2*/
        int ios1 = 1;
        int iosBeforeYear = 2015;
        if (ios1 == 0 && iosBeforeYear < 2015) {
            System.out.println("становите облегченную версию приложения для iOS по ссылке");
        } else if (ios1 == 0 && iosBeforeYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ios1 == 1 && iosBeforeYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        /*Task3*/
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год не является високосным");
        }
        /*Task4*/
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            int deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays ++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        /*Task5*/
        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Укажите правильный месяц");

        }
    }
}