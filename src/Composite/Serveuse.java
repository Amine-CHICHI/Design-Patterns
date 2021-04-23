package Composite;

public class Serveuse {
    ComposantDeMenu toutMenus ;

    public Serveuse(ComposantDeMenu toutMenus){
        this.toutMenus = toutMenus;
    }

    public void printMenu(){
        toutMenus.afficher();
    }
}
