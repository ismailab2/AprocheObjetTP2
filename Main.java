
import java.util.Set;
import java.util.HashSet;

public class Main {

    static public void main (String [] args ){

        /* 

        Set <Product> products = new HashSet<Product>();
        
        Product product = new Product("Ananas", 100, 10);

        Product product0 = new Product("mangue", 50, 10);
        Product product1 = new Product("Ananas", 100, 10);
        products.add(product);
        products.add(product1);
        products.add(product0);
        System.out.println(products);

        Product VolumeProduct = new VolumeProduct("mangue", 100, 10,2);
        System.out.println(VolumeProduct);

        Product WeightProduct = new WeightProduct("pomme", 100, 10,5);
        System.out.println(WeightProduct);

        Product RestaurantService = new RestaurantService("pomme", 100);
        System.out.println(RestaurantService);


        */

        Catalog c1 = Catalog.getInstance();
        Catalog c2 = Catalog.getInstance();

        System.out.println(c1 == c2); // true → Singleton

        c1.addProduct("Pomme", 10);
        c1.addProduct("Banane", 5);

        c2.removeProduct("Pomme", 3);

        c1.showCatalog();


    }

}