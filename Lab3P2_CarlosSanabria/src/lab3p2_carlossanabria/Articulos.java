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
public class Articulos {
    private int num_serie;
    private double precio;
    private String color,info_g;

    public Articulos(int num_serie, double precio, String color, String info_g) {
        this.num_serie = num_serie;
        this.precio = precio;
        this.color = color;
        this.info_g = info_g;
    }

    public Articulos() {
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo_g() {
        return info_g;
    }

    public void setInfo_g(String info_g) {
        this.info_g = info_g;
    }

    @Override
    public String toString() {
        return "Articulos{" + "num_serie=" + num_serie + ", precio=" + precio + ", color=" + color + ", info_g=" + info_g + '}';
    }
    
    
}
