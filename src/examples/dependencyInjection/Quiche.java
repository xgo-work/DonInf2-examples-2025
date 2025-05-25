package examples.dependencyInjection;

public class Quiche extends Tarte{

    public Quiche(IPate pate) {
        super(pate);
    }

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


