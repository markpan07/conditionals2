public class Main {
    public static void main(String[] args) {
        task1 ();
        System.out.println();
        task2 ();
        System.out.println();
        task3 ();
        System.out.println();
        task4 ();
        System.out.println();
        task5 ();
        System.out.println();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        char clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("У вас нет операционной системы :(");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        char clientOS = 0;
        int clientDeviceYear = 2015;
        int deviceProductionYear = 2013;
        switch (clientOS) {
            case 0:
                if (deviceProductionYear >= clientDeviceYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (deviceProductionYear < clientDeviceYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        float year = 900;
        boolean itIsForthYear = (year % 4) == 0;
        boolean itIs400Year = (year % 400) == 0;
        boolean itIs100Year = (year % 100) == 0;


        if (itIsForthYear && !itIs100Year) {
            System.out.println(year + " год вискосный");
            } else if (itIs100Year && itIs400Year) {
                System.out.println(year + " год вискосный");
            } else {
            System.out.println(year + " год обычный");
        }
    }




    public static void task4 () {
        System.out.println("Задача 4");
    }

    public static void task5 () {
        System.out.println("Задача 5");
    }

}