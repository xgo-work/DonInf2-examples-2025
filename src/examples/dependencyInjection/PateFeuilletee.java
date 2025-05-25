package examples.dependencyInjection;

public class PateFeuilletee implements IPate {

    @Override
    public void abaisser() {
        System.out.println("Pate feuilletée abaissée");
    }

    @Override
    public void preparer() {
        System.out.println("Pâte feuilletée prête");
    }

    @Override
    public boolean estCuite() {
        //...
        return true;
    }
}
