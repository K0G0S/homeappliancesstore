public class AirCondition {

    private int Ipsos;
    private int Platos;
    private int Ba8os;
    private String Kataskeuastis;
    private String OnomaModelou;
    private String Typos;
    private int Katanalwsi;
    private int Kiou;
    private int Zesti;
    private boolean Wifi;
    private boolean FiltroAera;
    private static int Posotita;
    
    public AirCondition()
    {
        periodicMantainance();
        Posotita++;
    }

    public AirCondition(int Ipsos ,int Platos , int Ba8os , String Kataskeuastis , String OnomaModelou , String Typos , int Katanalwsi , boolean Wifi , boolean FiltroAera , int Posotita )
    {
        Posotita++;

        setIpsos(Ipsos);                                                /** me tin entoli set arxikopoioume tis entoles */
        setPlatos(Platos);
        setBa8os(Ba8os);
        setKataskeuastis(Kataskeuastis);
        setOnomaModelou(OnomaModelou);
        setTypos(Typos);
        setKatanalwsi(Katanalwsi);
        setKiou(Kiou);
        setZesti(Zesti);
        setWifi(Wifi);
        setAirFilter(FiltroAera);
        setPosotita(Posotita);
    }

    public void showAll()
    {
        System.out.println("--Air Conditioner--");

        System.out.printf("Ipsos: %d\n",this.Ipsos);
        System.out.printf("Platos: %d\n",this.Platos);
        System.out.printf("Ba8os: %d\n",this.Ba8os);
        System.out.printf("Kataskeuastis: %s\n",this.Kataskeuastis);
        System.out.printf("OnomaModelou: %s\n",this.OnomaModelou);
        System.out.printf("Typos: %s\n",this.Typos);
        System.out.printf("Power Supply: %d\n",this.Katanalwsi);
        System.out.printf("Cold Power: %d\n",this.Kiou);
        System.out.printf("Hot Power: %d\n",this.Zesti);
        System.out.printf("Has Wifi: %b\n",this.Wifi);
        System.out.printf("Has Air Filtering: %b\n",this.FiltroAera);
        System.out.printf("Times Created: %d\n",Posotita);

    }

    public static int getPosotita()                                                           /** me tin entoli return epistrefoume ta apotelesmata */
    {
        return Posotita;
    }

    private void periodicMantainance()
    {

    }

    private void periodicMantainance(int overloaded)
    {

    }

    public int getIpsos()
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

    public int getKiou() {
        return Kiou;
    }
    public void setKiou(int Kiou) {
        this.Kiou = Kiou;
    }

    public int getZesti() {
        return Zesti;
    }

    public void setZesti(int Zesti) {
        this.Kiou = Zesti;
    }

    public boolean Wifi() {
        return Wifi;
    }

    public void setWifi(boolean Wifi) {
        this.Wifi = Wifi;
    }

    public boolean FiltroAera() {
        return FiltroAera;
    }

    public void setAirFilter(boolean FiltroAera) {
        this.FiltroAera = FiltroAera;
    }

    public int setPosotita(int Posotita) {
        return Posotita;
    }
}