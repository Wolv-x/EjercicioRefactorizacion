/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.iccr.Evento;


public class Salon {

    private String tipoSalon;
    private double valorSalon;

    Evento asistentes;

    public double getValorSalon() {
        return this.valorSalon;
    }

    public void setValorSalon(double valorSalon) {
        this.valorSalon = valorSalon;
    }

    public void salonAsignado() {
        if (this.asistentes.getAsistentesTotales() >= 15 && this.asistentes.getAsistentesTotales() <= 25) {
            this.tipoSalon = "platino";
            this.valorSalon = 350;
        }
        if (this.asistentes.getAsistentesTotales() >= 26 && this.asistentes.getAsistentesTotales() <= 45) {
            this.tipoSalon = "Esmeralda";
            this.valorSalon = 425;
        }
        if (this.asistentes.getAsistentesTotales() > 45) {
            this.tipoSalon = "Diamante";
            this.valorSalon = 500;
        }
    }

}
