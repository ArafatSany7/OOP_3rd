
abstract class mobileUser {

    public abstract void sendMasege();

}

class rahim extends mobileUser {

    @Override
    public void sendMasege() {
        System.out.println("Send messege");
    }

}

class karim extends mobileUser {

    @Override
    public void sendMasege() {
        System.out.println("karim call");
    }
}

public class mobile {

    public static void main(String[] args) {
        mobileUser mu;  //reffrence variable

        mu = new rahim();
        mu.sendMasege();

        mu = new karim();
        mu.sendMasege();

    }

}
