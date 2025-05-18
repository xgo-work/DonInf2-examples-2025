package examples.templatePattern;

import examples.templatePattern.ustensile.Cuisine;
import examples.templatePattern.ustensile.MouleATarte;
import examples.templatePattern.ustensile.Recipient;

public class Quiche implements IRecette{

    private Pate pate;
    private MouleATarte moule;

    @Override
    public void preparer() {

        prechaufferFour(200);
        preparerPate();
        abaisserPate();
        preparerMoule();
        raperFromage();
        ajouterLaitetOeufs();
        enfourner(45);
        while (!verifierCuisson()) {
            enfourner(5);
        }
    }

    private void ajouterLaitetOeufs() {
    }

    private void raperFromage() {
    }

    private void abaisserPate() {
        this.pate.abaisser();
    }

    private void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    private void preparerPate() {
        Recipient recipient = Cuisine.getRecipient();
        recipient.ajouter("farine");
        recipient.ajouter("oeuf");
        recipient.ajouter("beurre");
        this.pate = new Pate(recipient.getContenu());
    }

    private void preparerMoule() {
        MouleATarte moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    private void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }

    private boolean verifierCuisson() {
        return true;
    }
}


