package examples.templatePattern;

import examples.templatePattern.ustensile.Cuisine;
import examples.templatePattern.ustensile.MouleATarte;
import examples.templatePattern.ustensile.Recipient;

public class TartePomme implements IRecette{

    private Pate pate;
    private MouleATarte moule;

    @Override
    public void preparer() {

        this.prechaufferFour(200);
        this.preparerPate();
        this.preparerMoule();
        this.couperPommes();
        this.ajouterPommes();
        this.enfourner(45);
        while (!verifierCuisson()) {
            this.enfourner(5);
        }
        System.out.println("Tarte aux pommes prête !");
    }

    private void ajouterPommes() {}

    private void couperPommes() {}

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
