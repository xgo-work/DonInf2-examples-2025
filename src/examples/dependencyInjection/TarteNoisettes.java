package examples.dependencyInjection;

public class TarteNoisettes extends Tarte {

    private void ajouterNoisettes() {
        System.out.println("Noisettes ajoutées");
    }

    private void ajouterChocolat() {
        System.out.println("Chocolat ajouté");
    }

    @Override
    protected void preparerGarniture() {
        ajouterNoisettes();
        ajouterChocolat();
    }

    @Override
    protected void ajouterGarniture() {
        System.out.println("Garniture ajoutée");
    }

    @Override
    protected void messageFin() {
        System.out.println("Tarte aux noisettes prête !");
    }

}
