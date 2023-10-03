class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }

        if (vehicle instanceof MotorCheck) {
            ((MotorCheck) vehicle).checkEngine();
        }

        if (vehicle instanceof TrailerCheck) {
            ((TrailerCheck) vehicle).checkTrailer();
        }
    }
}