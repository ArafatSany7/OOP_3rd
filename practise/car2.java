class car {
    String brand;
    String name;

    public void display() {
        System.out.println("Car brannd is " + brand);
        System.out.println("Car name is " + name);
    }
}

public class car2 {
    public static void main(String[] args) {
        car car1 = new car();
        car1.brand = "Toyota";
        car1.name = "gt86";

        car1.display();

    }
}
