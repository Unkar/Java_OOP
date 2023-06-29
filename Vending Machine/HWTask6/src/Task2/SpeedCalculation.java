//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
//public class SpeedCalculation {
//    public double calculateAllowedSpeed(Vehicle vehicle) {
//        if (vehicle.getType().equalsIgnoreCase("Car")) {
//            return vehicle.getMaxSpeed() * 0.8;
//        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
//            return vehicle.getMaxSpeed() * 0.6;
//        }
//
//        return 0.0;
//    }
//}
//public class Vehicle {
//    int maxSpeed;
//    String type;
//    public Vehicle(int maxSpeed, String type) {
//        this.maxSpeed = maxSpeed;
//        this.type = type;
//    }
//    public int getMaxSpeed() {
//        return this.maxSpeed;
//    }
//    public String getType() {
//        return this.type;
//    }
//}
//
//Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle),
//        напишите метод calculateAllowedSpeed().
//        Использование этого метода позволит сделать класс SpeedCalculation
//        соответствующим OCP

package Task2;

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
    return vehicle.calculateAllowedSpeed(vehicle);
    }
}
class Vehicle {
    int maxSpeed;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return 0;
    }
}

class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
}

class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.6;
    }
}



