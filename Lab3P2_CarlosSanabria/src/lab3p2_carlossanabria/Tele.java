/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlossanabria;

/**
 *
 * @author Carlos Sanabria
 */
public class Tele extends Articulos{
    private String smart,marca;
    private int tam_pan,cant_conex,grosor;

    public Tele(String smart, String marca, int tam_pan, int cant_conex, int grosor, int num_serie, double precio, String color, String info_g) {
        super(num_serie, precio, color, info_g);
        this.smart = smart;
        this.marca = marca;
        this.tam_pan = tam_pan;
        this.cant_conex = cant_conex;
        this.grosor = grosor;
    }

    public Tele(String smart, String marca, int tam_pan, int cant_conex, int grosor) {
        this.smart = smart;
        this.marca = marca;
        this.tam_pan = tam_pan;
        this.cant_conex = cant_conex;
        this.grosor = grosor;
    }

    public String getSmart() {
        return smart;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTam_pan() {
        return tam_pan;
    }

    public void setTam_pan(int tam_pan) {
        this.tam_pan = tam_pan;
    }

    public int getCant_conex() {
        return cant_conex;
    }

    public void setCant_conex(int cant_conex) {
        this.cant_conex = cant_conex;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return super.toString()+"Tele{" + "smart=" + smart + ", marca=" + marca + ", tam_pan=" + tam_pan + ", cant_conex=" + cant_conex + ", grosor=" + grosor + '}';
    }
    
    
}
