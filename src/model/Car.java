package model;

public class Car extends Transport{
    public Car(String modelName, int wheelsCount) {
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
}
