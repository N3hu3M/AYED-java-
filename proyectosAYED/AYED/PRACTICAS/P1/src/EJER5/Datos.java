/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJER5;

/**
 *
 * @author nehuen
 */
public class Datos {
  private int min;
  private int max;
  private double prom;

    public Datos() {
    }
  
    public Datos(int min, int max, double prom) {
        this.min = min;
        this.max = max;
        this.prom = prom;
    }
  
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getProm() {
        return prom;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "Datos{" + "min=" + min + ", max=" + max + ", prom=" + prom + '}';
    }
    
}
