package poo.iccr.Evento;

import java.util.ArrayList;

public class Evento {

    private String nombreResponsable;
    private String tipoEvento;
    private int numeroNinos;
    private int numeroAdultos;
    private double precioEvento;
    private String tematica;
    private ArrayList <String> servicios = new ArrayList<String>();
    private double precioComida;
    private int asistentesTotales;


    public Evento(String nombreResponsable, int numeroNinos, int numeroAdultos, String tematica, String tipoEvento) {
        this.nombreResponsable = nombreResponsable;
        this.numeroNinos = numeroNinos;
        this.numeroAdultos = numeroAdultos;
        this.tematica = tematica;
        this.tipoEvento=tipoEvento;
        setAsistentesTotales();
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setNumeroNinos(int numeroNinos) {
        this.numeroNinos = numeroNinos;
    }

    public int getNumeroAdultos() {
        return numeroAdultos;
    }

    public int getNumeroNinos() {
        return numeroNinos;
    }
    public void setNumeroAdultos(int numeroAdultos) {
        this.numeroAdultos = numeroAdultos;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }


    public ArrayList<String> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    public void setServicios(String servicioNuevo) {
        this.servicios.add(servicioNuevo);
    }

    public String getTematica() {
        return tematica;
    }
    

    public String presentarServicios() {
        String serviciosDelEvento = "";
        
        for (String auxiliarForeachServicios : servicios) {
            if (auxiliarForeachServicios != null) {
                serviciosDelEvento += auxiliarForeachServicios + " - ";
            }
        }
        return serviciosDelEvento;
    }

    public int numeroServicios() {
        return this.servicios.size();
    }

    public double getPrecio() {
        return precioEvento;
    }

    public void setPrecio(double precio) {
        this.precioEvento = precio;
    }

    public void Comida() {
        this.precioComida = 12 * this.numeroNinos + 25 * this.numeroAdultos;
    }
Salon salon;

    public void calculaPrecio() {
        this.precioEvento = 150 + salon.getValorSalon() + numeroServicios() * 4.5
                + this.precioComida;
    }

    public int getAsistentesTotales() {
        return asistentesTotales;
    }
    public void setAsistentesTotales() {
        this.asistentesTotales = this.numeroNinos+this.numeroAdultos;
    }

    /*
    @Override
    public String toString() {
        return "Evento{" + "responsable=" + this.nombreResponsable + ", tipoEvento=" + this.tipoEvento
                + ", ni\u00f1os=" + this.numeroNinos + ", adultos=" + this.numeroAdultos + ", asistentesTotales="
                + this.asistentesTotales + ", tematica=" + this.tematica + ", salon=" + this.salon
                + ", valorSalon=" + this.valorSalon + ", precioEvento=" + this.precioEvento
                + ", apellidoCliente=" + this.apellidoCliente + ", nombrecliente="
                + this.nombrecliente + ", contactoCliente=" + this.contactoCliente
                + ", servicios=" + this.presentarServicios() + ", numeroServicios=" + this.numeroServicios
                + ", precioComida=" + this.precioComida + '}';
    }*/
}
