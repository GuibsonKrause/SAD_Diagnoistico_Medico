package CDP;

/**
 *
 * @author gkrause
 */
public class Doencas
{
    private String nomeD;
    private String dor;
    private String febre;
    private String manchas;
    private String tosse;
    private String cansaco;

    public Doencas(String nomeD, String dor, String frebre, 
            String manchas, String tosse, String cansaco)
    {
        this.nomeD = nomeD;
        this.dor = dor;
        this.febre = frebre;
        this.manchas = manchas;
        this.tosse = tosse;
        this.cansaco = cansaco;
    }

    public Doencas()
    {

    }
    
    public void ler()
    {
        System.out.println(this.nomeD);
        System.out.println(this.dor);
        System.out.println(this.febre);
        System.out.println(this.manchas);
        System.out.println(this.tosse);
        System.out.println(this.cansaco);
    }

    public String getNomeD()
    {
        return nomeD;
    }

    public void setNomeD(String nomeD)
    {
        this.nomeD = nomeD;
    }

    public String getDor()
    {
        return dor;
    }

    public void setDor(String dor)
    {
        this.dor = dor;
    }

    public String getFebre()
    {
        return febre;
    }

    public void setFebre(String frebre)
    {
        this.febre = frebre;
    }

    public String getManchas()
    {
        return manchas;
    }

    public void setManchas(String manchas)
    {
        this.manchas = manchas;
    }

    public String getTosse()
    {
        return tosse;
    }

    public void setTosse(String tosse)
    {
        this.tosse = tosse;
    }

    public String getCansaco()
    {
        return cansaco;
    }

    public void setCansaco(String cansaco)
    {
        this.cansaco = cansaco;
    }
    
}
