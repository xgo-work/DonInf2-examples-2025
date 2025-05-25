package examples.dependencyInjection;

// Corrigé partie I & II
public class Main {

    public static void main(String[] args) {
        Tarte tartePomme = new Tarte(new PateFeuilletee(), new GarnitureTartePomme(), "Tarte aux pommes");
        tartePomme.preparer();

        System.out.println("====================================");
        Tarte quiche = new Tarte(new PateBrisee(), new GarnitureQuiche(), "Quiche fromage");
        quiche.preparer();
        /**
         * *** Exercice Implementer une injection de dépendance par constructeur ***
         * *** CONSTRUCTOR DEPENDENCY INJECTION ***
         *
         * PARTIE I DONE
         * DONE 1. Créez une interface IPate avec les méthodes
         *      void preparer();
         *      void abaisser();
         *      boolean estCuite();
         * DONE 2. modifier la classe PateBrisee pour qu'elle implémente IPate
         * DONE 3. Faites de même avec PateFeuilletee
         * DONE  4. Modifier la classe Tarte
         *   - le constructeur prend une IPate en paramètre
         *   - la variable d'instance devient une IPate
         * DONE 5. Adapter les classes qui en héritent (il faut un constructeur qui prend une IPate)
         * DONE 6. Retirer la méthode preparerPate de la classe Tarte et adapter la methode preparer()
         * DONE 7. Adapter le main pour invoquer les constructeurs prenant une IPate en paramètre
         * Vous devriez pouvoir déclarer une tarte aux pommes comme ceci
         * new TartePomme(new PateFeuilletee());
         *
         * PARTIE II
         * On peut appliquer la même approche pour la garniture.
         * Cela va impliquer des changements fondamentaux dans la construction du code
         * DONE 1. Déclarer une interface IGarnitureTarte
         *    void preparerGarniture()
         *    void ajouterGarniture(Moule)
         *
         * DONE 2. Déclarer 3 classes qui implémentent IGarniture
         *    - GarnitureTartePomme
         *    - GarnitureTarteNoisette
         *    - GarnitureQuiche
         * DONE 3. Injecter une IGarnitureTarte dans le constructeur de Tarte (et déclarer une variable d'instance IGarniture)
         * DONE 4. Transformez Tarte en classe concrète et modifiez la méthode preparer en appelant les méthodes sur IPate et IGarniture
         *   (faites toutes les transformations nécessaires)
         * DONE 5. Vous pouvez maintenant effacer entièrement les classe TartePomme, TarteNoisette, ...
         * DONE 6. Vous devriez maintenant pouvoir déclarer une tarte comme ceci
         *      new Tarte(new PateBrisee(...), new GarniturePomme());
         *
         * Quelles sont les conséquences positives et négatives sur la structure du code ?
         *
         * On a appliqué le principe de séparation des préoccupations (Separation of concerns)
         * On peut maintenant composer n'importe quelle tarte à partir d'une garniture et d'une pâte donc un couplage plus faible.
         * Mais le code est un peu plus complexe à comprendre car la recette se trouve maintenant exécutée dans 3 fichiers différents
         *
         * De plus dans l'implémentation réalisée ici on a ajouté un paramètre nom de recette de manipre à pouvoir conserver la méthode messageFin()
         * Ce paramètre est "error-prone" (sujet à faire des erreurs) au sens ou il pourrait ne pas correspondre à la garniture choisie.
         */
        System.out.println("====================================");

        Tarte tarteNoisettes = new Tarte(new PateFeuilletee(), new GarnitureTarteNoisettes(), "Tarte aux noisettes");
        tarteNoisettes.preparer();
    }
}
