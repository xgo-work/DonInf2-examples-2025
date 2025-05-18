package examples.singleton;

// EXERCICE : faire de cette classe un singleton avec une methode getInstance()
public class Game {
    private static Game instance;

    private Game() {

    }

    public Game getInstance(){
        if(Game.instance == null){
            Game.instance = new Game();
        }
        return Game.instance;
    }
}
