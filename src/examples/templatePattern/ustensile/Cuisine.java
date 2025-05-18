package examples.templatePattern.ustensile;


public class Cuisine {

    public static MouleATarte getMouleATarte(){
        return new MouleATarte();
    }

    public static Recipient getRecipient() {
        return new Recipient();
    }

    public static Four getFour() {
        return new Four();
    }
}
