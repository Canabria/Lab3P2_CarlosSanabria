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
    private double sal_pro;
    private String meta;
   private String lista;

    public E_Supevisor(double sal_pro, String meta, String lista, String nombre, String apellido, double salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.sal_pro = sal_pro;
        this.meta = meta;
        this.lista = lista;
    }

    public E_Supevisor(double sal_pro, String meta, String lista) {
        this.sal_pro = sal_pro;
        this.meta = meta;
        this.lista = lista;
    }

   
    

   
    public double getSal_pro() {
        return sal_pro;
    }

    public void setSal_pro(double sal_pro) {
        this.sal_pro = sal_pro;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }


    

    @Override
    public String toString() {
        return super.toString()+"E_Supevisor{" +"sal_pro=" + sal_pro + ", meta=" +meta+ ", lista=" + lista + '}';
    }
    
    
    
}
