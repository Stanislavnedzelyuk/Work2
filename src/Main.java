public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}

abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public abstract void updateTyre();

    public void checkEngine() {

    }
    public void checkTrailer() {

    }
}