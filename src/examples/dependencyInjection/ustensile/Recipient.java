package examples.dependencyInjection.ustensile;

import java.util.ArrayList;
import java.util.List;

public class Recipient {


    List<String> contenu = new ArrayList<String>();

    public void ajouter(String ingredient){
        contenu.add(ingredient);
    }

    public void melanger(){

    }

    public String getContenu() {
        return String.join(" ", contenu);
    }


}
