

public class UnitProduct extends Product {

    private final int nombresArticleVendu;

    UnitProduct(String nom , int prix, flaot vat, int nombresArticleVendu ){
        super(nom,prix, vat)
        this.nombresArticleVendu = nombresArticleVendu;
    }

    @Override

    public int getPriceExcludingVAT (){
        return price*nombresArticleVendu;
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