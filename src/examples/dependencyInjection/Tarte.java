package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.MouleATarte;

public abstract class Tarte implements IRecette {

    private IPate pate;
    private MouleATarte moule;

    protected Tarte(IPate pate) {
        this.pate = pate;
    }

    // Méthode template
    @Override
    public void preparer() {
        this.prechaufferFour(200);
        // logique de preparation de la pate encapsulée dans IPate
        this.pate.preparer();
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
