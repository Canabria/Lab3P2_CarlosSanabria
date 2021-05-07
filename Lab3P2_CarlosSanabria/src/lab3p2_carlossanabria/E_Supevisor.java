/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlossanabria;

import java.util.ArrayList;

/**
 *
 * @author Carlos Sanabria
 */
public class E_Supevisor extends Empleados{
    private double sal_pro,meta;
    private String lista_comp;
    ArrayList<E_cajero> c=new ArrayList();

    public E_Supevisor(double sal_pro, double meta, String lista_comp, String nombre, String apellido, String salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.sal_pro = sal_pro;
        this.meta = meta;
        this.lista_comp = lista_comp;
    }

    public E_Supevisor(double sal_pro, double meta, String lista_comp) {
        this.sal_pro = sal_pro;
        this.meta = meta;
        this.lista_comp = lista_comp;
    }

    

   
    public double getSal_pro() {
        return sal_pro;
    }

    public void setSal_pro(double sal_pro) {
        this.sal_pro = sal_pro;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    

    public String getLista_comp() {
        return lista_comp;
    }

    public void setLista_comp(String lista_comp) {
        this.lista_comp = lista_comp;
    }

    public ArrayList<E_cajero> getC() {
        return c;
    }

    public void setC(ArrayList<E_cajero> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString()+"E_Supevisor{" +"sal_pro=" + sal_pro + ", meta=" +meta  + ", lista_comp=" + lista_comp + ", c=" + c + '}';
    }
    
    
    
}
