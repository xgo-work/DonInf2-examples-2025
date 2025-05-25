package examples.templatePattern;

import examples.templatePattern.ustensile.Cuisine;
import examples.templatePattern.ustensile.Recipient;

public class PateBrisee {

    boolean ready = false;
    String[] ingredients;

    public PateBrisee(String[] ingredients){
        this.ingredients = ingredients;
    }

    public void preparer() {
        Recipient recipient = Cuisine.getRecipient();
        for (String ingredient : ingredients) {
            recipient.ajouter(ingredient);
        }
        //...
        ready = true;
    }

    public void abaisser(){
        if(!ready){
            System.out.println("La pâte n'est pas prête");
        }else {
            System.out.println("Pâte abaissée");
        }
    }

    boolean estCuite() {
        //...
        return true;
    }
}
