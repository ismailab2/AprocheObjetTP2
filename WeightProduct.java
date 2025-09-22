
public class VolumeProduct extends Product {

    private final int poidArticleVendu;

    public VolumeProduct(String nom , int prix, flaot vat, int poidArticleVendu ){
        super(nom,prix, vat)
        this.poidArticleVendu = poidArticleVendu;
    }

    @Override

    public int getPriceExcludingVAT (){
        return price*poidArticleVendu;
    }


    @Override
    public float getVATAmount (){
        return getPriceExcludingVAT()*(VAT/100.0f);
    }

    @Override
    public float getPriceIncludingVAT(){
        return  getPriceExcludingVAT() + getVATAmount ();
    }

}