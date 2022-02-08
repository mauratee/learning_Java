// Cannot run this class in CLI because "main" not defined
class Bicycle {
    
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence: " +
        cadence + ", speed: " + speed +
        ", gear: " + gear);
    }

}

// run with `java BicycleDemo` in CLI
class BicycleDemo {
    public static void main(String[] args) {
        
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike bike3 = new MountainBike();

        bike1.changeCadence(50);
        bike1.printStates();
        bike1.speedUp(2);
        bike1.printStates();
        bike1.changeCadence(45);
        bike1.printStates();

        bike2.changeCadence(60);
        bike2.printStates();
        bike2.speedUp(10);
        bike2.printStates();
        bike2.changeGear(3);
        bike2.printStates();
        bike2.applyBrakes(15);
        bike2.printStates();

        bike3.changeCadence(35);
        bike3.printStates();

        // print class names of bike variables
        System.out.println(bike3.getClass().getSimpleName());
        System.out.println(bike2.getClass().getSimpleName());
        System.out.println(bike1.getClass().getSimpleName());

    }
}