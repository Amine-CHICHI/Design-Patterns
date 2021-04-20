package Composite;

public class Plat extends ComposantDeMenu {
    private String nom;
    private String description;
    private double price;
    private boolean vegetarien;

    public Plat(String nom, String description, double price, boolean vegetarien) {
        this.nom = nom;
        this.description = description;
        this.price = price;
        this.vegetarien = vegetarien;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrix() {
        return price;
    }

    @Override
    public boolean estVegetarien() {
        return vegetarien;
    }

    @Override
    public void afficher() {
        System.out.println(getNom() + (estVegetarien() ? "(v)" : "") + ", " + getPrix());
        System.out.println("\t-- " + getDescription());
    }


}


