/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Walter
 */
public class Equipos {
    private int codiEquipo;
    private String nombEquipo, descEquipo;

    public Equipos() {
    }

    public Equipos(int codiEquipo, String nombEquipo, String descEquipo) {
        this.codiEquipo = codiEquipo;
        this.nombEquipo = nombEquipo;
        this.descEquipo = descEquipo;
    }

    public int getCodiEquipo() {
        return codiEquipo;
    }

    public void setCodiEquipo(int codiEquipo) {
        this.codiEquipo = codiEquipo;
    }

    public String getNombEquipo() {
        return nombEquipo;
    }

    public void setNombEquipo(String nombEquipo) {
        this.nombEquipo = nombEquipo;
    }

    public String getDescEquipo() {
        return descEquipo;
    }

    public void setDescEquipo(String descEquipo) {
        this.descEquipo = descEquipo;
    }

    @Override
    public String toString() {
        return this.nombEquipo;
    }
}
