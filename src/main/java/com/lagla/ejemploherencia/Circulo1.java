/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lagla.ejemploherencia;

/**
 *
 * @author labctr
 */
public class Circulo1 extends FiguraGeometrica1 {
    private double radio;
    
    public Circulo1(double radio){
        this.radio= radio;
    }

    @Override
    public double CalcularArea() {
        radio=3.14*radio*radio;
        return area;
    }
}
