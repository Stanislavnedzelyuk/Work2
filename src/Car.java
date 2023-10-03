class  Car extends Vehicle implements MotorCheck {
public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
        }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}