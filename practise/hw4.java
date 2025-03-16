
abstract class Vehicle {

    public abstract void move();

    public void carry() {
        System.out.println("Vehicle can carrry 60 lb load");
    }
}

class car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {

    }

}

public class hw4 {

    public static void main(String[] args) {

    }
}
