package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.Recipient;

public class PateBrisee implements IPate {

    boolean ready = false;
    String[] ingredients;

    public PateBrisee(){
        // appel de l'autre constructeur ()
        this(new String[]{"beurre", "farine", "eau"});
    }

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

    public boolean estCuite() {
        //...
        return true;
    }
}
