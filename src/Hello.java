public class Hello {

    public static void main(String[] args) {
        String str = "Hello";
        Car car = new Car(str);
        fun(car);
        System.out.println(car.name);
    }

    public static void fun(Car car) {
        car = new Car("123");
        System.out.println(car.name);
    }
}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}
