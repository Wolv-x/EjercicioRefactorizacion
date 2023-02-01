package poo.iccr.Evento;

import java.util.ArrayList;

public class Evento {

    private String nombreResponsable;
    private String tipoEvento;
    private int numeroNinos;
    private int numeroAdultos;
    private double precioEvento;
    private String tematica;
    private ArrayList<String> servicios = new ArrayList<String>();
    private double precioComida;
    private int asistentesTotales;
    private Salon salon;
    private Cliente cliente;


    public Evento(String nombreResponsable, int numeroNinos, int numeroAdultos, String tematica, String tipoEvento) {
        this.nombreResponsable = nombreResponsable;
        this.numeroNinos = numeroNinos;
        this.numeroAdultos = numeroAdultos;
        this.tematica = tematica;
        this.tipoEvento = tipoEvento;
        this.precioComida=setPrecioDeComida();
        setAsistentesTotales();
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

    public void setSalon(Salon salon) {
        this.salon = salon;
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


    public int numeroServicios() {
        return this.servicios.size();
    }

    public double getPrecio() {
        return calcularPrecio();
    }

    public void setPrecio(double precio) {
        this.precioEvento = precio;
    }

    public double setPrecioDeComida() {
       return this.precioComida = 12 * this.numeroNinos + 25 * this.numeroAdultos;
    }
    
    public double calcularPrecio() {
        return this.precioEvento = 150 + salon.getValorSalon() + (numeroServicios() * 4.5 )+ setPrecioDeComida() ;
    }

    public int getAsistentesTotales() {
        return asistentesTotales;
    }

    public void setAsistentesTotales() {
        this.asistentesTotales = this.numeroNinos + this.numeroAdultos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
    @Override
    public String toString() {
        return "Evento{" + "responsable=" + this.nombreResponsable + ", tipoEvento=" + this.tipoEvento
                + ", ninos=" + this.numeroNinos + ", adultos=" + this.numeroAdultos + ", asistentesTotales="
                + this.asistentesTotales + ", tematica=" + this.tematica + ", salon=" + this.salon
                + ", apellidoCliente=" + this.cliente.getApellidoCliente() + ", nombrecliente="
                + this.cliente.getNombrecliente() + ", contactoCliente=" + this.cliente.getContactoCliente()
                + ", servicios=" + this.servicios.toString() + ", numeroServicios=" + this.servicios.size()
                + ", precioComida=" + this.precioComida + '}';
    }
}
