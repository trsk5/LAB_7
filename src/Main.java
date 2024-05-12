import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть завдання:");
        System.out.println("1. Сервіс таксі");
        System.out.println("2. Телефонна книга");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ви обрали завдання 1: Сервіс таксі");
                TaxiService.main(args);
                break;
            case 2:
                System.out.println("Ви обрали завдання 2: Телефонна книга");
                PhoneBook.main(args);
                break;
            default:
                System.out.println("Ви вибрали неправильний номер завдання.");
                break;
        }

        scanner.close();
    }
}
