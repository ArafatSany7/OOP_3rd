class Animal {
    String name;
    String habitat;
    String diet;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Habitat: " + habitat);
        System.out.println("Diet: " + diet);
    }
}

class Mammal extends Animal {
    String furType;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur Type: " + furType);
    }
}

class Bird extends Animal {
    double wingSpan;

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (wingSpan >= 0) {
            System.out.println("Wingspan: " + wingSpan + " meters");
        } else {
            System.out.println("Wingspan value is invalid!");
        }
    }
}

class Dog extends Mammal {
    String breed;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

class Owl extends Bird {
    boolean nightVision;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Night Vision: " + (nightVision ? "Yes" : "No"));
    }
}

public class hierarchy {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.name = "Generic Animal";
        a.habitat = "Earth";
        a.diet = "Omnivore";
        a.displayInfo();
        System.out.println();

        Mammal m = new Mammal();
        m.name = "Elephant";
        m.habitat = "Forest";
        m.diet = "Herbivore";
        m.furType = "Thick";
        m.displayInfo();
        System.out.println();

        // Bird
        Bird b = new Bird();
        b.name = "Eagle";
        b.habitat = "Mountains";
        b.diet = "Carnivore";
        b.wingSpan = 2.5;
        b.displayInfo();
        System.out.println();

        Dog d = new Dog();
        d.name = "Buddy";
        d.habitat = "House";
        d.diet = "Omnivore";
        d.furType = "Short";
        d.breed = "Golden Retriever";
        d.displayInfo();
        System.out.println();

        Owl o = new Owl();
        o.name = "Hedwig";
        o.habitat = "Forest";
        o.diet = "Carnivore";
        o.wingSpan = -1.2;
        o.nightVision = true;
        o.displayInfo();
    }
}
