package CDP;

/**
 *
 * @author gkrause
 */
public class Analysis
{
    private String nomeD;
    private int SintTosse;
    private int SintDor;
    private int SintFebre;
    private int SintMancha;
    private int SintCansaco;

    public Analysis(String nomeD)
    {        
        this.nomeD = nomeD;
        this.SintTosse = 0;
        this.SintDor = 0;
        this.SintFebre = 0;
        this.SintMancha = 0;
        this.SintCansaco = 0;
    }

    public String getNomeD()
    {
        return nomeD;
    }

    public void setNomeD(String nomeD)
    {
        this.nomeD = nomeD;
    }

    public int getSintTosse()
    {
        return SintTosse;
    }

    public void setSintTosse(int SintTosse)
    {
        this.SintTosse = SintTosse;
    }

    public int getSintDor()
    {
        return SintDor;
    }

    public void setSintDor(int SintDor)
    {
        this.SintDor = SintDor;
    }

    public int getSintFebre()
    {
        return SintFebre;
    }

    public void setSintFebre(int SintFebre)
    {
        this.SintFebre = SintFebre;
    }

    public int getSintMancha()
    {
        return SintMancha;
    }

    public void setSintMancha(int SintMancha)
    {
        this.SintMancha = SintMancha;
    }

    public int getSintCansaco()
    {
        return SintCansaco;
    }

    public void setSintCansaco(int SintCansaco)
    {
        this.SintCansaco = SintCansaco;
    }     
}
