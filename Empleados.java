
package com.mycompany.estructuradedatos;

/**
 *
 * @author Valentina UwU
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     private int numTrabajador;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private double horasEx;
    private int sueldo;
    private int ingreso;
    private double horasExtra;
    String estado;
     int antiguedad;
    
           
     Empleados() {
    }

    public Empleados(int numTrabajador, String nombre, String apPaterno,
            String apMaterno, int horasEx, int sueldo, int ingreso) {
        this.numTrabajador = numTrabajador;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.horasEx = 276.5;
        this.sueldo = sueldo;
        this.ingreso = ingreso;
    }

    public Empleados(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getHorasExtra() {
        return horasExtra;
    }


    public int getNumTrabajador() {
        return numTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public double getHorasEx() {
        return horasEx;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        estado = "";
        estado +=  (this.numTrabajador)+"/n";
        
        estado += (this.nombre)+"/n";
        
        return estado;
    }
    
    public double calcularSueldo(){
        antiguedad = 2022 - this.ingreso;
        
       double total = (this.sueldo + (this.sueldo*(antiguedad *0.03)) + 
               (this.horasExtra * this.horasEx));
        
        return total;
    }
   
    }
    

