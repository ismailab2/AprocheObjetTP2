
public class WeightProduct extends Product {

    private final int poidArticleVendu;

    public WeightProduct(String nom , int prix, float vat, int poidArticleVendu ){
        super(nom,prix, vat);
        this.poidArticleVendu = poidArticleVendu;
    }

    @Override

    public int getPriceExcludingVAT (){
        return super.getPriceExcludingVAT()*poidArticleVendu;
    }


    @Override
    public float getVATAmount (){
        return getPriceExcludingVAT()*(super.getVAT()/100.0f);
    }

    @Override
    public float getPriceIncludingVAT(){
        return  getPriceExcludingVAT() + getVATAmount ();
    }

}