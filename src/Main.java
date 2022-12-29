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
    }

    public static void task3 () {
        System.out.println("Задача 3");
    }

    public static void task4 () {
        System.out.println("Задача 4");
    }

    public static void task5 () {
        System.out.println("Задача 5");
    }

}