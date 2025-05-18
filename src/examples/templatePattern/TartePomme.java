package examples.templatePattern;

import examples.templatePattern.ustensile.Cuisine;
import examples.templatePattern.ustensile.MouleATarte;
import examples.templatePattern.ustensile.Recipient;

public class TartePomme implements IRecette{

    private Pate pate;
    private MouleATarte moule;

    @Override
    public void preparer() {

        prechaufferFour(200);
        preparerPate();
        abaisserPate();
        preparerMoule();
        couperPommes();
        ajouterPommes();
        enfourner(45);
        while (!verifierCuisson()) {
            enfourner(5);
        }
    }

    private void ajouterPommes() {}

    private void couperPommes() {}

    private void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    private boolean verifierCuisson() {
        return true;
    }

    private void preparerPate() {
        Recipient recipient = Cuisine.getRecipient();
        recipient.ajouter("farine");
        recipient.ajouter("oeuf");
        recipient.ajouter("beurre");
        this.pate = new Pate(recipient.getContenu());
    }

    private void abaisserPate() {
        this.pate.abaisser();
    }

    private void preparerMoule() {
        MouleATarte moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    private void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }

}
