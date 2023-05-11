public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car();
        car2.setModelName("car2");
        car2.setWheelsCount(4);

        Truck truck = new Truck("truck1", 8);
        Truck truck2 = new Truck();
        truck2.setModelName("truck2");
        truck2.setWheelsCount(6);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle();
        bicycle2.setModelName("bicycle2");
        bicycle2.setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}