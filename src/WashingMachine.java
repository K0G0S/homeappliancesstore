public class WashingMachine {

    private int Ipsos;
    private int Platos;
    private int Ba8os;
    private String Kataskeuastis;
    private String OnomaModelou;
    private String Typos;
    private int Katanalwsi;
    private boolean hasPause;
    private int Xwritikotita;
    private int StrofesAnaDeutero;
    private String[] Fermokrasies;
    private int KatanalwsiNerou;
    private static int timesCreated;

    public WashingMachine()
    {
        timesCreated++;
        periodicMantainance();
    }

    public WashingMachine(int Ipsos,int Platos,int Ba8os,String Kataskeuastis,String OnomaModelou,String Typos,int Katanalwsi, boolean hasPause, int Xwritikotita,int StrofesAnaDeutero,String[] Fermokrasies,int KatanalwsiNerou)
    {
        timesCreated++;

        setIpsos(Ipsos);                                                      /** me tin entoli set arxikopoioume tis entoles */
        setPlatos(Platos);
        setBa8os(Ba8os);
        setKataskeuastis(Kataskeuastis);
        setOnomaModelou(OnomaModelou);
        setTypos(Typos);
        setKatanalwsi(Katanalwsi);
        setPause(hasPause);
        setXwritikotita(Xwritikotita);
        setStrofesAnaDeutero(StrofesAnaDeutero);
        setFermokrasies(Fermokrasies);
        setKatanalwsiNerou(KatanalwsiNerou);

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
        System.out.println("--Washing Machine--");

        System.out.printf("Ipsos: %d\n",this.Ipsos);
        System.out.printf("Platos: %d\n",this.Platos);
        System.out.printf("Ba8os: %d\n",this.Ba8os);
        System.out.printf("Kataskeuastis: %s\n",this.Kataskeuastis);
        System.out.printf("OnomaModelou: %s\n",this.OnomaModelou);
        System.out.printf("Typos: %s\n",this.Typos);
        System.out.printf("Power Supply: %d\n",this.Katanalwsi);
        System.out.printf("Has Pause: %b\n",this.hasPause);
        System.out.printf("Xwritikotita: %d\n",this.Xwritikotita);
        System.out.printf("Turns Per Second: %d\n",this.StrofesAnaDeutero);
        System.out.printf("Fermokrasies: %s\n",this.Fermokrasies);
        System.out.printf("Watter Supply: %s\n",this.KatanalwsiNerou);
        System.out.printf("Times Created: %d\n",timesCreated);


    }
    
    public int getIpsos()                         /** me tin entoli return epistrefoume ta apotelesmata */
    {
        return this.Ipsos;
    }
    public void setIpsos(int Ipsos)
    {
        this.Ipsos = Ipsos;
    }
    
    public int getPlatos()
    {
        return this.Platos;
    }
    public void setPlatos(int Platos)
    {
        this.Platos = Platos;
    }
    
    public int getBa8os()
    {
        return this.Ba8os;
    }
    public void setBa8os(int Ba8os)
    {
        this.Ba8os = Ba8os;
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
    
    public boolean HasPause() {
        return hasPause;
    }
    public void setPause(boolean hasPause) {
        this.hasPause = hasPause;
    }
    
    public int getXwritikotita() {
        return Xwritikotita;
    }
    public void setXwritikotita(int Xwritikotita) {
        this.Xwritikotita = Xwritikotita;
    }
    
    public int getStrofesAnaDeutero() {
        return StrofesAnaDeutero;
    }
    public void setStrofesAnaDeutero(int StrofesAnaDeutero) {
        this.StrofesAnaDeutero = StrofesAnaDeutero;
    }
    
    public String[] getFermokrasies() {
        return Fermokrasies;
    }
    public void setFermokrasies(String[] Fermokrasies) {
        this.Fermokrasies = Fermokrasies;
    }
    
    public int getKatanalwsiNerou() {
        return KatanalwsiNerou;
    }
    public void setKatanalwsiNerou(int KatanalwsiNerou) {
        this.KatanalwsiNerou = KatanalwsiNerou;
    }
    
}