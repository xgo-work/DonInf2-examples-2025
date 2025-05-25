package examples.dependencyInjection;

public class GarnitureTarteNoisettes implements IGarnitureTarte {

    private void ajouterNoisettes() {
        System.out.println("Noisettes ajoutées");
    }

    private void ajouterChocolat() {
        System.out.println("Chocolat ajouté");
    }

    @Override
    public void preparerGarniture() {
        ajouterNoisettes();
        ajouterChocolat();
    }

    @Override
    public void ajouterGarniture() {
        System.out.println("Garniture ajoutée");
    }

}
