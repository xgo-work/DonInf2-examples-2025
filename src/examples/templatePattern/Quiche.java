package examples.templatePattern;

public class Quiche extends Tarte{

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


}


