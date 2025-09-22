
public class BookProduct extends Product {

    static final float VAT_MOYEN = 5.5f;

    public BookProduct(String nom , int prix){
        super(nom, prix, VAT_MOYEN);
    }

}