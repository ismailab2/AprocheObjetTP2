

public class Main {

    static public void main (String [] args ){
        
        Product product = new Product("Ananas", 100, 10);
        System.out.println(product);

        Product product1 = new Product("Ananas", 100, 10);
        System.out.println(product1);

        Product VolumeProduct = new VolumeProduct("mangue", 100, 10,2);
        System.out.println(VolumeProduct);

        Product WeightProduct = new WeightProduct("pomme", 100, 10,5);
        System.out.println(WeightProduct);

        Product RestaurantService = new RestaurantService("pomme", 100);
        System.out.println(RestaurantService);


    }

}