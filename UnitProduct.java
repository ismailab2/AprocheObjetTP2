

public class UnitProduct extends Product {

    private final int nombresArticleVendu;

    UnitProduct(String nom , int prix, float vat, int nombresArticleVendu ){
        super(nom,prix, vat);
        this.nombresArticleVendu = nombresArticleVendu;
    }

    @Override

    public int getPriceExcludingVAT (){
        return super.getPriceExcludingVAT()*nombresArticleVendu;
    }


    @Override
    public float getVATAmount (){
        return super.getPriceExcludingVAT()*(super.getVAT()/100.0f);
    }

    @Override
    public float getPriceIncludingVAT(){
        return super.getPriceExcludingVAT() + getVATAmount ();
    }

}