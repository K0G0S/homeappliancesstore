public class Oven {

    private int Ipsos;
    private int Markos;
    private int Bafos;
    private String Kataskeuastis;
    private String OnomaModelou;
    private String Typos;
    private int Katanalwsi;
    private int Xwritikotita;
    private boolean EinaiPsifiakos;
    private boolean ExeiSxara;

    private static int timesCreated;
    public Oven()
    {
        timesCreated++;
        periodicMantainance();
    }

    public Oven(int Ipsos,int Markos,int Bafos,String Kataskeuastis,String OnomaModelou,String Typos,int Katanalwsi,int Xwritikotita,boolean EinaiPsifiakos,boolean ExeiSxara)
    {
        timesCreated++;

        setIpsos(Ipsos);
        setMarkos(Markos);
        setBafos(Bafos);
        setKataskeuastis(Kataskeuastis);
        setOnomaModelou(OnomaModelou);
        setTypos(Typos);
        setKatanalwsi(Katanalwsi);
        setXwritikotita(Xwritikotita);
        setDigital(EinaiPsifiakos);
        setGrill(ExeiSxara);
    }
   
    public static int getTimesCreated()
    {
        return timesCreated;
    }
   
    private void periodicMantainance()
    {

    }
    private void periodicMantainance(int overloaded)
    {

    }
    
    public void showAll()
    {
        System.out.println("--Oven--");

        System.out.printf("Ipsos: %d\n",this.Ipsos);
        System.out.printf("Markos: %d\n",this.Markos);
        System.out.printf("Bafos: %d\n",this.Bafos);
        System.out.printf("Kataskeuastis: %s\n",this.Kataskeuastis);
        System.out.printf("OnomaModelou: %s\n",this.OnomaModelou);
        System.out.printf("Typos: %s\n",this.Typos);
        System.out.printf("Power Supply: %d\n",this.Katanalwsi);
        System.out.printf("Xwritikotita: %d\n",this.Xwritikotita);
        System.out.printf("Is Digital: %b\n",this.EinaiPsifiakos);
        System.out.printf("Has Grill: %b\n",this.ExeiSxara);
        System.out.printf("Items Created: %d\n",timesCreated);
    }
    
    public int getIpsos()
    {
        return this.Ipsos;
    }
    public void setIpsos(int Ipsos)
    {
        this.Ipsos = Ipsos;
    }
    
    public int getMarkos()
    {
        return this.Markos;
    }
    public void setMarkos(int Markos)
    {
        this.Markos = Markos;
    }
    
    public int getBafos()
    {
        return this.Bafos;
    }
    public void setBafos(int Bafos)
    {
        this.Bafos = Bafos;
    }

    public String getKataskeuastis()
    {
        return this.Kataskeuastis;
    }
    public void setKataskeuastis(String Kataskeuastis)
    {
        this.Kataskeuastis=Kataskeuastis;
    }

    public String getOnomaModelou()
    {
        return this.OnomaModelou;
    }
    public void setOnomaModelou(String OnomaModelou)
    {
        this.OnomaModelou=OnomaModelou;
    }

    public String getTypos()
    {
        return this.Typos;
    }
    public void setTypos(String Typos)
    {
        this.Typos=Typos;
    }

    public int getKatanalwsi()
    {
        return this.Katanalwsi;
    }
    public void setKatanalwsi(int Katanalwsi)
    {
        this.Katanalwsi = Katanalwsi;
    }

    public int getXwritikotita() {
        return Xwritikotita;
    }
    public void setXwritikotita(int Xwritikotita) {
        this.Xwritikotita = Xwritikotita;
    }

    public boolean EinaiPsifiakos() {
        return EinaiPsifiakos;
    }
    public void setDigital(boolean digital) {
        EinaiPsifiakos = digital;
    }

    public boolean ExeiSxara() {
        return ExeiSxara;
    }
    public void setGrill(boolean ExeiSxara) {
        this.ExeiSxara = ExeiSxara;
    }
}