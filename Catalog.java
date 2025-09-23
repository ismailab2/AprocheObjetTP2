
import java.util.HashMap;
import java.util.Map;

public class Catalog {

    // Instance unique (singleton)
    private static Catalog instance;

    // stock de produit (nom --> quantité)
    private Map<String, Integer> products;

    //contructeur privée
    private Catalog (){
        products = new HashMap<>();
    }


    // methode pour récuperer les instances uniques
    public static Catalog getInstance (){

        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    // Ajouter un produit
    public void addProduct(String name, int quantité) {
        products.put(name, products.getOrDefault(name, 0) + quantité);
    }


    //retirer un produit
    public void removeProduct (String name, int quantité){
        if(products.containsKey(name)){
            int newquantité = products.get(name) - quantité;
            if (newquantité > 0){
                addProduct(name, newquantité);
            }
            else{
                products.remove(name);
            }
        }
        else{
            System.out.println("Le produit '" + name + "' n'existe pas.");
        }
    }

    //Récupérer la quantité d’un produit
    public int getQuantiteProduct(String name){
        return products.getOrDefault(name,0); 
    }

     // Afficher le catalogue
    public void showCatalog() {
        if (products.isEmpty()) {
            System.out.println("Le catalogue est vide.");
        } else {
            System.out.println("Catalogue des produits :");
            for (Map.Entry<String, Integer> entry : products.entrySet()) {
                System.out.println("- " + entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}




