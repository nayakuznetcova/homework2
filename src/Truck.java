public class Truck extends AutoEngine{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public Truck(){

    }

    public void check() {
        checkTires();
        checkEngine();
        System.out.println("Проверяем прицеп");
    }
}
