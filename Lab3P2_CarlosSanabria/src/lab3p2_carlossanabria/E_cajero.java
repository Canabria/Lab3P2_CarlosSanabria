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
public class E_cajero {
    private String horario, meta;
    private int cant_a, hora_alm, cant_emplea;

    public E_cajero(String horario, String meta, int cant_a, int hora_alm, int cant_emplea) {
        this.horario = horario;
        this.meta = meta;
        this.cant_a = cant_a;
        this.hora_alm = hora_alm;
        this.cant_emplea = cant_emplea;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public int getCant_a() {
        return cant_a;
    }

    public void setCant_a(int cant_a) {
        this.cant_a = cant_a;
    }

    public int getHora_alm() {
        return hora_alm;
    }

    public void setHora_alm(int hora_alm) {
        this.hora_alm = hora_alm;
    }

    public int getCant_emplea() {
        return cant_emplea;
    }

    public void setCant_emplea(int cant_emplea) {
        this.cant_emplea = cant_emplea;
    }

    @Override
    public String toString() {
        return "E_cajero{" + "horario=" + horario + ", meta=" + meta + ", cant_a=" + cant_a + ", hora_alm=" + hora_alm + ", cant_emplea=" + cant_emplea + '}';
    }
    
    
}
