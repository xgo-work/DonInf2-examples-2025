package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.MouleATarte;

public abstract class Tarte implements IRecette {

    private PateBrisee pate;
    private MouleATarte moule;

    // Méthode template
    @Override
    public void preparer() {
        this.prechaufferFour(200);
        this.preparerPate();
        this.pate.abaisser();

        this.preparerMoule();
        this.preparerGarniture();
        this.ajouterGarniture();

        this.enfourner(45);
        while (!verifierCuisson()) {
            this.enfourner(5);
        }
        this.messageFin();
    }

    protected void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    protected boolean verifierCuisson() {
        return this.pate.estCuite();
    }

    protected void preparerPate() {
        String[] ingredients = new String[] {"farine", "beurre", "eau"};
        this.pate = new PateBrisee(ingredients);
    }

    protected void preparerMoule() {
        this.moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    protected void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }

    protected abstract void preparerGarniture();
    protected abstract void ajouterGarniture();
    protected abstract void messageFin();
}
