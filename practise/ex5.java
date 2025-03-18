
abstract class Animal {

    public abstract void eat();

    public abstract void move();

    public void life() {
        System.out.println("Animal got life !!!");
    }
}

class Human extends Animal {

    @Override
    public void eat() {
        System.out.println("Human can eat russian");

    }

    @Override
    public void move() {
        System.out.println("Human can visit russia");
    }

    @Override
    public void life() {
        System.out.println("Human do have life !!!");
    }

}

class Lion extends Animal {

    @Override
    public void eat() {
        System.out.println("Lion can eat russian(deer)");

    }

    @Override
    public void move() {
        System.out.println("Lion move faaaast");
    }

    public void hunt() {
        System.out.println("Lion Hunt Human!!!");
    }

}

class Bird extends Animal {

    @Override
    public void eat() {
        System.out.println("bird can eat russian(flower)");

    }

    @Override
    public void move() {
        System.out.println("Birds can visit russia");
    }

    public void fly() {
        System.out.println("Birds can fly to russia !!!");
    }

}

public class ex5 {

    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.life();

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}
