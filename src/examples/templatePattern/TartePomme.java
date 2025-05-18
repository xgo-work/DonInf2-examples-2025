package examples.templatePattern;

public class TartePomme extends Tarte{

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

}
