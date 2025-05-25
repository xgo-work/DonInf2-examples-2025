package examples.dependencyInjection;

public class GarnitureQuiche implements IGarnitureTarte{

    private void ajouterLaitetOeufs() {}

    private void raperFromage() {}

    @Override
    public void preparerGarniture() {
        raperFromage();
        ajouterLaitetOeufs();
    }

    @Override
    public void ajouterGarniture() {
    }

}


