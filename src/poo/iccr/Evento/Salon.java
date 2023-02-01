package poo.iccr.Evento;

public class Salon {

    private String tipoSalon;
    private double valorSalon;
    private int numeroDeAsistentes;

    public Salon(Evento eventoNuevo) {
        this.numeroDeAsistentes = eventoNuevo.getAsistentesTotales();
        asignarSalon();
        setValorSalon();
    }

    public double getValorSalon() {
        return this.valorSalon;
    }

    public void setValorSalon() {
        if (this.tipoSalon.equals("Platino")) {
            this.valorSalon = 350;                     
        }
        if (this.tipoSalon.equals("Esmeralda")) {
            this.valorSalon = 425;                     
        }
        if (this.tipoSalon.equals("Diamante")) {
            this.valorSalon = 500;                     
        }
    }

    public void asignarSalon() {
        if (this.numeroDeAsistentes >= 15 && this.numeroDeAsistentes <= 25) {
            this.tipoSalon = "Platino";
        }
        if (this.numeroDeAsistentes >= 26 && this.numeroDeAsistentes <= 45) {
            this.tipoSalon = "Esmeralda";
        }
        if (this.numeroDeAsistentes > 45) {
            this.tipoSalon = "Diamante";
        }
    }

    public String getTipoSalon() {
        return tipoSalon;
    }
    
    

}
