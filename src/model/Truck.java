package model;

public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
