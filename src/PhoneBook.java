import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        // Створення телефонної книги з прізвищами та номерами телефонів
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Smith", "1234567890");
        phoneBook.put("Johnson", "0987654321");
        phoneBook.put("Williams", "1112223333");
        phoneBook.put("Brown", "4445556666");
        phoneBook.put("Jones", "7778889999");
        // Додаткові записи...

        // Виведення інформації з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }

        // Пошук номера за прізвищем
        String lastName = "Brown";
        if (phoneBook.containsKey(lastName)) {
            System.out.println("Номер телефону для " + lastName + ": " + phoneBook.get(lastName));
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + lastName);
        }

        // Видалення довільного запису
        String removedLastName = phoneBook.keySet().iterator().next();
        phoneBook.remove(removedLastName);
        System.out.println("Видалено запис для " + removedLastName);

        // Виведення кількості записів у книзі
        System.out.println("Кількість записів у телефонній книзі: " + phoneBook.size());
    }
}
