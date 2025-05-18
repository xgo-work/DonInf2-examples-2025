package examples.templatePattern;

public class Quiche extends Tarte{

    private void ajouterLaitetOeufs() {}

    private void raperFromage() {}

    @Override
    protected void preparerGarniture() {
        raperFromage();
        ajouterLaitetOeufs();
    }

    @Override
    protected void ajouterGarniture() {
    }

    @Override
    protected void messageFin() {
        System.out.println("Quiche prête !");
    }

}


