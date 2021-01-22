public abstract class Device implements DeviceBasic{
        public double Makros;
        public double Ipsos;
        public double Ba8os;
        public String Kataskeuastis;
        public String OnomaModelou;
        public String IdosSiskeuis;
        public String Katanalwsi;
        public Boolean status;

        public double getMakros (){
            return Makros;
        }
        public double getIpsos (){
            return Ipsos;
        }
        public double getBa8os (){
            return Ba8os;
        }
        public String getKataskeuastis (){
            return Kataskeuastis;
        }
        public String getOnomaModelou (){
            return OnomaModelou;
        }
        public String getIdosSiskeuis (){
            return IdosSiskeuis;
        }
        public String getKatanalwsi (){
            return Katanalwsi;
        }

        public void setMakros (double Makros) {
            Device.Makros = Makros;
        }
        public void setIpsos (double Ipsos) {
            Device.Ipsos = Ipsos;
        }
        public void setBa8os (double Ba8os) {
            Device.Ba8os = Ba8os;
        }
        public void setKataskeuastis (String Kataskeuastis) {
            Device.Kataskeuastis = Kataskeuastis;
        }
        public void setOnomaModelou (String OnomaModelou) {
            Device.OnomaModelou = OnomaModelou;
        }
        public void setIdosSiskeuis (String IdosSiskeuis) {
            Device.IdosSiskeuis = IdosSiskeuis;
        }
        public void setKatanalwsi (String Katanalwsi) {
            Device.Katanalwsi = Katanalwsi;
        }

        public void powerOn(){
            status=true;
        }
        public void powerOff(){
            status=false;
        }
        public boolean status(){
            return status;
        }

    }