package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends ComposantDeMenu {
    private ArrayList<ComposantDeMenu> composantList = new ArrayList<>();
    private String nom;
    private String description;

    public Menu(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void ajouter(ComposantDeMenu composantdemenu){
        composantList.add(composantdemenu);
    }

    public void supprimer(ComposantDeMenu composantdemenu){
        composantList.remove(composantdemenu);
    }

    public ComposantDeMenu getEnfant(int i){
        return composantList.get(i);
    }

    public void afficher(){
        System.out.println("\n"+getNom().toUpperCase()+", "+getDescription());
        System.out.println("------------------------------------------------------------");

        Iterator<ComposantDeMenu> iterator = composantList.iterator();
        while(iterator.hasNext()){
            ComposantDeMenu composantdemenu = iterator.next();
            composantdemenu.afficher();
        }
    }
}
