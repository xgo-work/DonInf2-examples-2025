package examples.singleton;

// Singleton exercice correction
public class Game {

    // Singleton instance
    private static Game instance;

    // private constructor to prevent instantiation
    private Game() {

    }

    // Static method to get the singleton instance
    public Game getInstance(){
        if(Game.instance == null){
            Game.instance = new Game();
        }
        return Game.instance;
    }
}
