class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class BMW extends Car {
    public BMW(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "BMW -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }
}

class Mars extends Car {
    public Mars(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return "Mars -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mars -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mars -> brake()";
    }
}

class Nano extends Car {
    public Nano(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class MainCar {
    public static void main(String[] args) {
//        Car car = new Car("Base Car",8);
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        BMW bmw = new BMW("BMW ZS",6);
//        System.out.println(bmw.startEngine());
//        System.out.println(bmw.accelerate());
//        System.out.println(bmw.brake());
//
//        Nano nano = new Nano("Nano New",4);
//        System.out.println(nano.startEngine());
//        System.out.println(nano.accelerate());
//        System.out.println(nano.brake());

        for (int i = 1; i <= 5; i++) {
            Car car = getRandomCar();
            System.out.println("Car #" + i + " : " + car.getName());
            System.out.println("Task Perform : " + car.startEngine());
            System.out.println("Task Perform : " + car.accelerate());
            System.out.println("Task Perform : " + car.brake());
            System.out.println();
        }
    }

    public static Car getRandomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Number generated is " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new BMW("BMW ZS+", 8);

            case 2:
                return new Mars("Mars VS", 6);

            case 3:
                return new Nano("Nano New", 4);

            default:
                return null;
        }
    }
}
