import java.util.ArrayList;
import java.util.Random;

class Car {
    private final String brand;
    private Driver driver;

    public Car(String brand, Driver driver) {
        this.brand = brand;
        this.driver = driver;
    }

    public void repairEngine() {
    }

    public void hireNewDriver(Driver newDriver) {
        driver = newDriver;
    }

    public void increasePowerAndPrice() {
    }

    public String getBrand() {
        return brand;
    }

    public Driver getDriver() {
        return driver;
    }

}

class Driver {
    private final String name;
    private final int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public void attendTrainingCourse() {
        if (age > 25 && drivingExperience < 5) {
            drivingExperience++;
        }
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 0;
    }
}

class Helper {
    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }
}

class TaxiService {
    public static void main(String[] args) {
        // Створення автомобілів
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", new Driver("John", 30, 3)));
        cars.add(new Car("Honda", new Driver("Alice", 35, 6)));
        // Додаткові автомобілі...

        // Ремонт половини автопарку
        for (int i = 0; i < cars.size() / 2; i++) {
            cars.get(i).repairEngine();
            cars.get(i).hireNewDriver(new Driver("New Driver", 25, 1));
        }

        // Підвищення потужності та ціни для кожної другої машини
        for (int i = 0; i < cars.size(); i += 2) {
            cars.get(i).increasePowerAndPrice();
        }

        // Перевірка досвіду водіїв та відправлення на курси
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.attendTrainingCourse();
            }
        }

        // Вибір випадкової машини та виведення повідомлення
        Car randomCar = Helper.getRandomCar(cars);
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");

        // Виведення повідомлення про прибуття водія
        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }
}
