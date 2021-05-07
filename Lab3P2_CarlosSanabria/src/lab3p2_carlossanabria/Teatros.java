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
public class Teatros extends Articulos {
    private int cant_alt,cant_discBR;
    private String info_limp;

    public Teatros(int cant_alt, int cant_discBR, String info_limp, int num_serie, double precio, String color, String info_g) {
        super(num_serie, precio, color, info_g);
        this.cant_alt = cant_alt;
        this.cant_discBR = cant_discBR;
        this.info_limp = info_limp;
    }

    public Teatros() {
        super();
    }

    

    public int getCant_alt() {
        return cant_alt;
    }

    public void setCant_alt(int cant_alt) {
        this.cant_alt = cant_alt;
    }

    public int getCant_discBR() {
        return cant_discBR;
    }

    public void setCant_discBR(int cant_discBR) {
        this.cant_discBR = cant_discBR;
    }

    public String getInfo_limp() {
        return info_limp;
    }

    public void setInfo_limp(String info_limp) {
        this.info_limp = info_limp;
    }

    @Override
    public String toString() {
        return "Teatro\n" 
                + "\nCantidad de altavoces: " + cant_alt 
                + "\nCantidad discos Blue Ray: " + cant_discBR 
                + "\nInfo de Limpieza de Lector de Discos: " + info_limp;
    }
    
}
