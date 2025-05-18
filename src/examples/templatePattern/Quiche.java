package examples.templatePattern;

import examples.templatePattern.ustensile.Cuisine;
import examples.templatePattern.ustensile.MouleATarte;
import examples.templatePattern.ustensile.Recipient;

public class Quiche implements IRecette{

    private Pate pate;
    private MouleATarte moule;

    @Override
    public void preparer() {

        this.prechaufferFour(190);
        this.preparerPate();
        this.preparerMoule();
        this.raperFromage();
        this.ajouterLaitetOeufs();
        this.enfourner(40);
        while (!verifierCuisson()) {
            this.enfourner(5);
        }
        System.out.println("Quiche prête !");
    }

    private void ajouterLaitetOeufs() {
    }

    private void raperFromage() {
    }

    private void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    private boolean verifierCuisson() {
        return this.pate.estCuite();
    }

    private void preparerPate() {
        Recipient recipient = Cuisine.getRecipient();
        recipient.ajouter("farine");
        recipient.ajouter("oeuf");
        recipient.ajouter("beurre");
        this.pate = new Pate(recipient.getContenu());
    }

    private void preparerMoule() {
        this.moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    private void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }
}


