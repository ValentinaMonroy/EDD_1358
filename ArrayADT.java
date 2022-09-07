/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estructuradedatos;

import java.util.ArrayList;

/**
 *
 * @author Valentina UwU
 */
public class ArrayADT<T> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private int tamaño;
    private int longitud;
    
    
    ArrayList<T> datos;
    
    public ArrayADT(int tam){
        this.tamaño = tam;
        
        datos = new ArrayList(this.tamaño);
        for (int i = 0; i <this.tamaño; i++ ){
        this.datos.add(null);
    }
        
       
    }
     public T getElemento(int indice){
         if(comprobacion(indice)){
             
         
            return this.datos.get(indice);
     }else{
             System.out.println("fuera de rango");
     }
         return null;
     }
     private boolean comprobacion(int indice){
         return indice >= 0 && indice < this.tamaño; 
     }
     
     public void setElemento(int indice, T dato){
         if(comprobacion (indice)){
             this.datos.set(indice, dato);
             
         }else{
             System.out.println("fuera de rango");
         }
     }
     public int getLongitud(){
         return this.tamaño;
     }
     public void limpiar(T dato){
         for(int i = 0; i < this.tamaño; i++){
             this.datos.set(i, dato);
             
         }
     }
     public String toString(){
         String estado = "";
         for (T dato : datos){
             if(dato != null){
                 estado += dato.toString()+"/n";
             }
         }
         return estado;
     }
    }
    

