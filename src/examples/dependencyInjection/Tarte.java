package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.MouleATarte;

public class Tarte implements IRecette {

    private IPate pate;
    private IGarnitureTarte garniture;
    private MouleATarte moule;
    private String nomRecette;

    public Tarte(IPate pate, IGarnitureTarte garniture, String nomRecette) {
        this.pate = pate;
        this.garniture = garniture;
        this.nomRecette = nomRecette;
    }

    // Méthode template
    @Override
    public void preparer() {
        this.prechaufferFour(200);
        // logique de preparation de la pate encapsulée dans IPate
        this.pate.preparer();
        this.pate.abaisser();

        this.preparerMoule();
        // logique garniture encapsulée dans garniture
        this.garniture.preparerGarniture();
        this.garniture.ajouterGarniture();

        this.enfourner(45);
        while (!verifierCuisson()) {
            this.enfourner(5);
        }
        this.messageFin();
    }

    private void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    private boolean verifierCuisson() {
        return this.pate.estCuite();
    }

    private void preparerMoule() {
        this.moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    private void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }

    private void messageFin() {
        System.out.println(this.nomRecette + " prêt(e)");
    }
}
