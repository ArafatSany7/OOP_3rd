
class animal {

    public void eat() {
        System.out.println("Animal eat ..");
    }
}

class dog extends animal {

    public void bork() {
        System.out.println("dog is barking");
    }
}

class cat extends animal {

    public void mewo() {
        System.out.println("Cat calling");
    }
}

public class test {

    public static void main(String[] args) {
        animal eat = new animal();
        cat mew = new cat();
        dog bak = new dog();

        eat.eat();
        mew.mewo();
        bak.bork();
    }

}
