package model;

import setvice.TransportService;

public abstract class Transport implements TransportService {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private String getModelName() {
        return modelName;
    }

    private int getWheelsCount() {
        return wheelsCount;
    }

    protected void updateTyre() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
        updateTyre();
    }
}
