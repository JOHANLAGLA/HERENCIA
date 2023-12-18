/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lagla.ejemploherencia;

/**
 *
 * @author labctr
 */
public class rectangulo extends FiguraGeometrica1 {
    private final double base;
    private final double altura;
   
    public rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
        
    }
          

    @Override
    public double CalcularArea() {
        area=base*altura;
        return area;
    }
    
}
