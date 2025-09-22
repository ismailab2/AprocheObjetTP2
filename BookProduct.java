
public class BookProduct extends Product {

    static final float VAT_MOYEN = 5.5f;

    public BookProduct(String nom , int prix){
        super(nom, prix, VAT_MOYEN)
    }

    @Override

    public int getPriceExcludingVAT (){
        return price;
    }


    @Override
    public float getVATAmount (){
        return price*(VAT/100.0f);
    }

    @Override
    public float getPriceIncludingVAT(){
        return price + getVATAmount ();
    }

}