public class Fridge {

    private int Ipsos;
    private int Platos;
    private int Bafos;
    private String Kataskeuastis;
    private String OnomaModelou;
    private String Typos;
    private int Katanalwsi;
    private int Xwritikotita;
    private int Rafia;
    private String Xrwma;
    private boolean DenExeiKatapsiksi;

    private static int timesCreated;
    public Fridge()
    {
        periodicMantainance();
        timesCreated++;
    }

    public Fridge(int Ipsos,int Platos,int Bafos,String Kataskeuastis,String OnomaModelou,String Typos,int Katanalwsi,int Xwritikotita,int Rafia,String Xrwma,boolean DenExeiKatapsiksi)
    {
        timesCreated++;

        setIpsos(Ipsos);
        setPlatos(Platos);
        setBafos(Bafos);
        setKataskeuastis(Kataskeuastis);
        setOnomaModelou(OnomaModelou);
        setTypos(Typos);
        setKatanalwsi(Katanalwsi);
        setXwritikotita(Xwritikotita);
        setRafia(Rafia);
        setXrwma(Xrwma);
        setNoFrost(DenExeiKatapsiksi);
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
        System.out.println("--Fridge--");

        System.out.printf("Ipsos: %d\n",this.Ipsos);
        System.out.printf("Platos: %d\n",this.Platos);
        System.out.printf("Bafos: %d\n",this.Bafos);
        System.out.printf("Kataskeuastis: %s\n",this.Kataskeuastis);
        System.out.printf("OnomaModelou: %s\n",this.OnomaModelou);
        System.out.printf("Typos: %s\n",this.Typos);
        System.out.printf("Power Supply: %d\n",this.Katanalwsi);
        System.out.printf("Xwritikotita: %d\n",this.Xwritikotita);
        System.out.printf("Rafia: %d\n",this.Rafia);
        System.out.printf("Xrwma: %s\n",this.Xrwma);
        System.out.printf("Has No Frost: %b\n",this.DenExeiKatapsiksi);
        System.out.printf("Times Created: %d\n",timesCreated);

    }

    public int getIpsos() {
        return this.Ipsos;
    }
    public void setIpsos(int Ipsos) {
        this.Ipsos = Ipsos;
    }

    public int getPlatos() {
        return this.Platos;
    }
    public void setPlatos(int Platos) {
        this.Platos = Platos;
    }

    public int getBafos() {
        return this.Bafos;
    }
    public void setBafos(int Bafos) {
        this.Bafos = Bafos;
    }

    public String getKataskeuastis() {
        return this.Kataskeuastis;
    }
    public void setKataskeuastis(String Kataskeuastis) {
        this.Kataskeuastis = Kataskeuastis;
    }

    public String getOnomaModelou() {
        return this.OnomaModelou;
    }
    public void setOnomaModelou(String OnomaModelou) {
        this.OnomaModelou = OnomaModelou;
    }

    public String getTypos() {
        return this.Typos;
    }
    public void setTypos(String Typos) {
        this.Typos = Typos;
    }

    public int getKatanalwsi() {
        return this.Katanalwsi;
    }
    public void setKatanalwsi(int Katanalwsi) {
        this.Katanalwsi = Katanalwsi;
    }

    public int getXwritikotita() {
        return Xwritikotita;
    }
    public void setXwritikotita(int Xwritikotita) {
        this.Xwritikotita = Xwritikotita;
    }

    public int getRafia() {
        return Rafia;
    }
    public void setRafia(int Rafia) {
        this.Rafia = Rafia;
    }

    public String getXrwma() {
        return Xrwma;
    }
    public void setXrwma(String Xrwma) {
        this.Xrwma = Xrwma;
    }

    public boolean DenExeiKatapsiksi() {
        return DenExeiKatapsiksi;
    }
    public void setNoFrost(boolean DenExeiKatapsiksi) {
        this.DenExeiKatapsiksi = DenExeiKatapsiksi;
    }
}