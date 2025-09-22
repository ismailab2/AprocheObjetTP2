
public class VolumeProduct extends Product {

    private final int voumeArticleVendu;

    public VolumeProduct(String nom , int prix, flaot vat, int voumeArticleVendu ){
        super(nom,prix, vat)
        this.voumeArticleVendu = voumeArticleVendu;
    }

    @Override

    public int getPriceExcludingVAT (){
        return price*voumeArticleVendu;
    }


    @Override
    public float getVATAmount (){
        return getPriceExcludingVAT()*(VAT/100.0f);
    }

    @Override
    public float getPriceIncludingVAT(){
        return getPriceExcludingVAT () + getVATAmount ();
    }

}