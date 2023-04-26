/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Hospital {

    /**
     * @return the nombre
     */
    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroCamas
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * @param numeroCamas the numeroCamas to set
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /**
     * @return the presupuesto
     */
    public double getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    // otra forma de get y set 
    

}
