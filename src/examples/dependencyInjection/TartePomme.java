package examples.dependencyInjection;

public class TartePomme extends Tarte{

    public TartePomme(IPate pate) {
        super(pate);
    }

    private void ajouterPommes() {}
    private void couperPommes() {}

    @Override
    protected void preparerGarniture() {
        couperPommes();
    }

    @Override
    protected void ajouterGarniture() {
        ajouterPommes();
    }

    @Override
    protected void messageFin() {
        System.out.println("Tarte aux pommes prête !");
    }

}
