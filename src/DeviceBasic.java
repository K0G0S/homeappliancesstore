public interface DeviceBasic {


    public abstract class Device implements DeviceBasic{
        public static double Mikos;
        public static double Ipsos;
        public static double depth;
        public static String Kataskeuastis;
        public static String OnomaModelou;
        public static String IdosSiskeueis;
        public static String Katanalwsi;
        public static Boolean Diafesimotita;
        public static double Ba8os;
        public static String IdosSiskeuis;
        public static double Makros;


        public double getMikos (){
            return Mikos;
        }
        public double getIpsos (){
            return Ipsos;
        }
        public double getDepth (){
            return depth;
        }
        public String getKataskeuastis (){
            return Kataskeuastis;
        }
        public String getOnomaModelou (){
            return OnomaModelou;
        }
        public String getIdosSiskeueis (){
            return IdosSiskeueis;
        }
        public String getKatanalwsi (){
            return Katanalwsi;
        }


        public void setMikos (double Mikos) {
            Device.Mikos = Mikos;
        }
        public void setIpsos (double Ipsos) {
            Device.Ipsos = Ipsos;
        }
        public void setDepth (double depth) {
            Device.depth = depth;
        }
        public void setKataskeuastis (String Kataskeuastis) {
            Device.Kataskeuastis = Kataskeuastis;
        }
        public void setOnomaModelou (String OnomaModelou) {
            Device.OnomaModelou = OnomaModelou;
        }
        public void setIdosSiskeueis (String IdosSiskeueis) {
            Device.IdosSiskeueis = IdosSiskeueis;
        }
        public void setKatanalwsi (String Katanalwsi) {
            Device.Katanalwsi = Katanalwsi;
        }
        public void powerOn(){
            Diafesimotita=true;
        }
        public void powerOff(){
            Diafesimotita=false;
        }
        public boolean Diafesimotita(){
            return Diafesimotita;
        }
    }
}