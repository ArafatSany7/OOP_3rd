
abstract class Animal {

    public abstract void eat();

    public abstract void move();

    public void life() {

        System.out.println("Life is created");
    }
}

class Human extends Animal {

    @Override
    public void eat() {
        System.out.println("Human eat rice");
    }

    @Override
    public void move() {
        System.out.println("Human can walk");
    }

    public void talk() {
        System.out.println("Human can talk");
    }
}

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.eat();
        human.move();
        human.talk();

    }
}
