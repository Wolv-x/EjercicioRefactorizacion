/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.iccr.Evento;


public class Salon {

    private String tipoSalon;
    private double valorSalon;
    private int numeroDeAsistentes;



    public Salon(Evento eventoNuevo) {
        this.numeroDeAsistentes = eventoNuevo.getAsistentesTotales();
    }

    public double getValorSalon() {
        return this.valorSalon;
    }

    public void setValorSalon(double valorSalon) {
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

    public void salonAsignado() {
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

}
