package examples.dependencyInjection;

public class GarnitureTartePomme implements IGarnitureTarte{

    private void ajouterPommes() {}
    private void couperPommes() {}

    @Override
    public void preparerGarniture() {
        couperPommes();
    }

    @Override
    public void ajouterGarniture() {
        ajouterPommes();
    }

}
