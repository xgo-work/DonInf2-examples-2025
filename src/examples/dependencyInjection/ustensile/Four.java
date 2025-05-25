package examples.dependencyInjection.ustensile;

public class Four {

    public void prechaufferFour(int temperature) {
        System.out.println("Four préchauffé à " + temperature + "°C");
    }

    public void enfourner(MouleATarte moule) {
        System.out.println("Moule à tarte enfourné");
    }

}
