/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecodeup.model;

/**
 *
 * @author Frank Rojas
 */

public class Opinion {
    private String op;
    private String cedula;
    private int x;
    public Opinion() {
    }

    public Opinion(String op, String cedula, int x) {
        this.cedula = cedula;
        this.op = op;
        this.x=x;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    @Override
    public String toString() {
        return this.op + ", " + this.cedula;
    }
}
