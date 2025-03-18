
interface polygon {

    int side = 8, length = 4, breadth = 8;

    public void getName();

    public void getSide();

    public void getarea();

    public void getperi();
}

class rectangle implements polygon {

    public void getName() {
        System.out.println("name is rectangle");
    }

    public void getSide() {
        System.out.println("4 side");
    }

    public void getarea() {
        System.out.println("area is 54" + length * breadth);
    }

    public void getperi() {
        System.out.println("Perimeter is " + 2 * (length + breadth));
    }
}

public class interfaacedemo {

    public static void main(String[] args) {

        rectangle name = new rectangle();
        rectangle per = new rectangle();
        name.getName();

        per.getperi();

    }

}
