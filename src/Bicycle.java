public class Bicycle extends Auto {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle() {

    }

    public void check() {
        checkTires();
    }
}