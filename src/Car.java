public class Car extends AutoEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {

    }

    public void check() {
        checkTires();
        checkEngine();
    }
}