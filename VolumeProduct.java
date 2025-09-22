
public class VolumeProduct extends Product {

    private final int voumeArticleVendu;

    public VolumeProduct(String nom , int prix, float vat, int voumeArticleVendu ){
        super(nom,prix, vat);
        this.voumeArticleVendu = voumeArticleVendu;
    }

    @Override

    public int getPriceExcludingVAT (){
        return super.getPriceExcludingVAT()*voumeArticleVendu;
    }


    @Override
    public float getVATAmount (){
        return getPriceExcludingVAT()*(super.getVAT()/100.0f);
    }

    @Override
    public float getPriceIncludingVAT(){
        return getPriceExcludingVAT () + getVATAmount ();
    }

}