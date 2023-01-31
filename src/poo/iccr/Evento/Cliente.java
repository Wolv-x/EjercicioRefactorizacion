/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.iccr.Evento;

/**
 *
 * @author Jhona
 */
public class Cliente {
    private String apellidoCliente;
    private String nombrecliente;
    private int contactoCliente;

    public Cliente(String apellidoCliente, String nombrecliente, int contactoCliente) {
        this.apellidoCliente = apellidoCliente;
        this.nombrecliente = nombrecliente;
        this.contactoCliente = contactoCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public int getContactoCliente() {
        return contactoCliente;
    }

    public void setContactoCliente(int contactoCliente) {
        this.contactoCliente = contactoCliente;
    }
}
