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
public class E_Assesor_F extends Empleados{
    private int cant_productos,tot_cred;
    private String lista_comp;
    ArrayList<String> c=new ArrayList<String>();

    public E_Assesor_F(int cant_productos, int tot_cred, String lista_comp, String nombre, String apellido, String salario, String nacionalidad) {
        super(nombre, apellido, salario, nacionalidad);
        this.cant_productos = cant_productos;
        this.tot_cred = tot_cred;
        this.lista_comp = lista_comp;
    }

    public E_Assesor_F(int cant_productos, int tot_cred, String lista_comp) {
        this.cant_productos = cant_productos;
        this.tot_cred = tot_cred;
        this.lista_comp = lista_comp;
    }

    

    


    public int getCant_productos() {
        return cant_productos;
    }

    public void setCant_productos(int cant_productos) {
        this.cant_productos = cant_productos;
    }

    public int getTot_cred() {
        return tot_cred;
    }

    public void setTot_cred(int tot_cred) {
        this.tot_cred = tot_cred;
    }

    public String getLista_comp() {
        return lista_comp;
    }

    public void setLista_comp(String lista_comp) {
        this.lista_comp = lista_comp;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public void setC(ArrayList<String> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString()+"E_Assesor_F{" + "cant_productos=" + cant_productos + ", tot_cred=" + tot_cred + ", lista_comp=" + lista_comp + ", c=" + c + '}';
    }
    
    
    
    
}
