package examples.dependencyInjection;

// Corrigé partie I
public class Main {

    public static void main(String[] args) {
        TartePomme tartePomme = new TartePomme();
        tartePomme.preparer();

        System.out.println("====================================");
        Quiche quiche = new Quiche();
        quiche.preparer();
        /**
         * *** Exercice Implementer une injection de dépendance par constructeur ***
         * *** CONSTRUCTOR DEPENDENCY INJECTION ***
         *
         *
         * PARTIE I
         * 1. Créez une interface IPate avec les méthodes
         *      void preparer();
         *      void abaisser();
         *      boolean estCuite();
         * 2. modifier la classe PateBrisee pour qu'elle implémente IPate
         * 3. Faites de même avec PateFeuilletee
         * 4. Modifier la classe Tarte
         *   - le constructeur prend une IPate en paramètre
         *   - la variable d'instance devient une IPate
         * 5. Adapter les classes qui en héritent (il faut un constructeur qui prend une IPate)
         * 6. Retirer la méthode preparerPate de la classe Tarte et adapter la methode preparer()
         * 7. Adapter le main pour invoquer les constructeurs prenant une IPate en paramètre
         * Vous devriez pouvoir déclarer une tarte aux pommes comme ceci
         * new TartePomme(new PateFeuilletee());
         *
         * PARTIE II
         * On peut appliquer la même approche pour la garniture.
         * Cela va impliquer des changements fondamentaux dans la construction du code
         * 1. Déclarer une interface IGarnitureTarte
         *    void preparerGarniture()
         *    void ajouterGarniture(Moule)
         *
         * 2. Déclarer 3 classes qui implémentent IGarniture
         *    - GarnitureTartePomme
         *    - GarnitureTarteNoisette
         *    - GarnitureQuiche
         * 3. Injecter une IGarnitureTarte dans le constructeur de Tarte (et déclarer une variable d'instance IGarniture)
         * 4. Transformez Tarte en classe concrète et modifiez la méthode preparer en appelant les méthodes sur IPate et IGarniture
         *   (faites toutes les transformations nécessaires)
         * 5. Vous pouvez maintenant effacer entièrement les classe TartePomme, TarteNoisette, ...
         * 6. Vous devriez maintenant pouvoir déclarer une tarte comme ceci
         *      new Tarte(new PateBrisee(...), new GarniturePomme());
         *
         * Quelles sont les conséquences positives et négatives sur la structure du code ?
         */
        System.out.println("====================================");

        TarteNoisettes tarteNoisettes = new TarteNoisettes();
        tarteNoisettes.preparer();
    }
}
