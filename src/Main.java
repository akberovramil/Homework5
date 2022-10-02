public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }else {
            System.out.println("Введите правильное значение");
        }
        //Задача 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }  else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задача 3
        int year = 146;
        int year1 = year % 4;
        int year2 = year % 100;
        int year3 = year % 400;
        if (year > 0 && year3 == 0) {
            System.out.println("Год является високосным");
        }else if (year > 0 && year2 == 0) {
            System.out.println("Год не является високосным");
        }else if (year > 0 && year1 != 0){
            System.out.println("Год не является високосным");
        } else if (year > 0 && year1 == 0) {
            System.out.println("Год является високосным");
        }
        //Задача 4
        int deliveryDistance = 72;
        int daysForDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance < 60) {
            daysForDelivery = daysForDelivery + 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance < 100) {
            daysForDelivery = daysForDelivery + 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }
        //Задача 5
        int monthNumber = 31;
        switch (monthNumber)
        {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Ошибка, введите правильный номер месяца");
                break;
        }
        //Задача 6
        int age = 19;
        double salary = 58000;

        if (age  < 23 && salary < 50000) {
            salary *= 2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age < 23 && salary >= 50000 && salary < 80000) {
            salary = salary * 2 * 1.2;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей" );

        } else if (age < 23 && salary >= 80000) {
            salary = salary * 2 * 1.5;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей" ); }

            if (age >= 23 && salary < 50000) {
            salary *= 3;
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
        } else if (age >= 23 && salary >= 50000 && salary < 80000) {
                salary = salary * 3 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            } else if (age >= 23 && salary >= 80000) {
                salary = salary * 3 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary + " рублей");
            }



    }

    }

