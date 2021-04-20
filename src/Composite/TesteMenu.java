package Composite;

public class TesteMenu {
    public static void main(String[] args) {
        ComposantDeMenu menuCreperie = new Menu("MENU CRÊPERIE", "Brunch");
        ComposantDeMenu menuCafeteria = new Menu("MENU CAFETERIA", "Déjeuner");
        ComposantDeMenu menuBrasserie = new Menu("MENU BRASSERIE", "Dîner");
        ComposantDeMenu menuDesserts = new Menu("MENU DESSERT", "Rien que des desserts !");
        ComposantDeMenu tousMenus = new Menu("TOUS LES MENUS", "Toutes nos offres");

        tousMenus.ajouter(menuBrasserie);
        tousMenus.ajouter(menuCafeteria);
        tousMenus.ajouter(menuCreperie);
        tousMenus.ajouter(menuDesserts);

        menuCafeteria.ajouter(new Plat("Pasta al pesto", "Spaghetti, ail, basilic et parmesan", 3.89, true));
        menuCafeteria.ajouter(new Plat("bibi al pesto", "djaj, ail, basilic et parmesan", 9.89, false));
        menuCafeteria.ajouter(new Plat("djaj al pesto", "djaj, ail, basilic et parmesan", 8.89, false));

        menuDesserts.ajouter(new Plat("fefe du chef", "fefe aux pommes avec une boule de glace vanille", 1.59, true));
        menuDesserts.ajouter(new Plat("dd du chef", "dd aux pommes avec une boule de glace vanille", 1.59, true));
        menuDesserts.ajouter(new Plat("rr du chef", "rr aux pommes avec une boule de glace vanille", 1.59, true));

        menuCafeteria.ajouter(menuDesserts);

        menuCreperie.ajouter(new Plat("Crêpe à l’oeuf", " Crêpe avec oeuf au plat ou brouillé", 2.35, false));
        menuCreperie.ajouter(new Plat("tt à l’oeuf", " Crêpe avec oeuf au plat ou brouillé", 2.35, true));
        menuCreperie.ajouter(new Plat("yy à l’oeuf", " Crêpe avec oeuf au plat ou brouillé", 2.35, false));

        menuBrasserie.ajouter(new Plat("special","biere", 15, false));
        menuBrasserie.ajouter(new Plat("heinken","biere", 25, true));
        menuBrasserie.ajouter(new Plat("1715","vodka", 135, true));


        Serveuse serveuse = new Serveuse(tousMenus);
        serveuse.printMenu();

    }


}
