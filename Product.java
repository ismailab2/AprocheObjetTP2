

public class Product{

    private final String name;
    private final int price;
    private final float VAT;

    static final float VAT_ELEVE = 20.f;
    static final float VAT_INTERMEDIAIRE = 10.0f;
    static final float VAT_MOYEN = 5.5f;
    static final float VAT_PETIT = 2.1f;

    public  Product (String nom, int prix, float vat){
        if (nom == null || nom.isEmpty()){
            throw new IllegalArgumentException ("Le nom d'un produit ne peut pas etre vide");
        }

        if (prix < 0){
            throw new IllegalArgumentException ("Le prix ne peut pas etre negatif");
        }

        if (vat != VAT_ELEVE && vat != VAT_INTERMEDIAIRE && vat != VAT_MOYEN && vat != VAT_PETIT ){
            throw new IllegalArgumentException ("Le TVA invalide ! ");
        }

        this.name = nom;
        this.price = prix;
        this.VAT = vat;
    }


    public String getName (){
        return name;
    }

    public int getPriceExcludingVAT (){
        return price;
    }


    public float getVATAmount (){
        return price*(VAT/100.0f);
    }

    public float getPriceIncludingVAT(){
        return price + getVATAmount ();
    }

    public float getVAT (){
        return VAT;
    }

}