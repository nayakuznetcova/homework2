public class AutoEngine extends Auto {
    public AutoEngine(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public AutoEngine() {

    }

    public void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}
