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
public class Clientes {
    private String nom, ape,nacio,direcion;
    private double sal,cant_cred;
    private int cant_comp;
    private String lista_comp;
    private String clase="no tiene";

    public Clientes(String nom, String ape, String nacio, String direcion, double sal, double cant_cred, int cant_comp, String lista_comp,String clase) {
        this.nom = nom;
        this.ape = ape;
        this.nacio = nacio;
        this.direcion = direcion;
        this.sal = sal;
        this.cant_cred = cant_cred;
        this.cant_comp = cant_comp;
        this.lista_comp = lista_comp;
        this.clase=clase;
    }

    public Clientes(String nom, String ape, String nacio, String direcion, double sal, double cant_cred, int cant_comp, String lista_comp) {
        this.nom = nom;
        this.ape = ape;
        this.nacio = nacio;
        this.direcion = direcion;
        this.sal = sal;
        this.cant_cred = cant_cred;
        this.cant_comp = cant_comp;
        this.lista_comp = lista_comp;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getCant_cred() {
        return cant_cred;
    }

    public void setCant_cred(double cant_cred) {
        this.cant_cred = cant_cred;
    }

    public int getCant_comp() {
        return cant_comp;
    }

    public void setCant_comp(int cant_comp) {
        this.cant_comp = cant_comp;
    }

    public String getLista_comp() {
        return lista_comp;
    }

    public void setLista_comp(String lista_comp) {
        this.lista_comp = lista_comp;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
     public String toString() {
        return "Clientes\n" 
                + "\nNombre: " + nom 
                + "\nApellido: " + ape 
                + "\nNacionalidad: " + nacio 
                + "\nDirecion: " + direcion 
                + "\nSalario:  " + sal 
                + "\nCantidad de credito: " + cant_cred 
                + "\nCantidad comprado: " + cant_comp 
                + "\nCompra Cliente" + lista_comp;
    }
    
    
}
