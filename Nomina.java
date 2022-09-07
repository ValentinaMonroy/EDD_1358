

package com.mycompany.estructuradedatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Nomina {


    public static void main(String[] args)throws FileNotFoundException {
        
            ArrayADT Nomina = new ArrayADT(14);
            
        try {
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Valentina UwU\\Downloads\\junio (1).dat"));
                        br.readLine();
			for (int i = 0; i < 14; i++) {			
				String[] tmp = br.readLine().split(",");			
				Empleados trabT = new Empleados(Integer.parseInt(tmp[0]),
                                        tmp[1], tmp[2], tmp[3], Integer.parseInt(tmp[4]), 
                                        Integer.parseInt(tmp[5]),(tmp[6]));
				Nomina.setElemento(i, trabT);
			}
                        
                       
                        for (int i = 0; i < Nomina.getLongitud(); i++) {
                            
				Empleados emple = (Empleados) Nomina.getElemento(i);
                                System.out.println("-----------------------------------------------");
				System.out.println("Numero del trabajador " + 
                                        emple.getNumTrabajador() + " Sueldo " + emple.calcularSueldo());

                     
			}
                        
           
                        int mr = 2023;
                        
                        int indice = 0;
                        
                        
                        for (int i = 0; i < Nomina.getLongitud(); i++){
                            Empleados tiem = (Empleados) Nomina.getElemento(i);
                            if(tiem.getIngreso()<mr){
                                mr = tiem.getIngreso();
                                indice=i;
                            }
 
                        }
                        System.out.println("El Empleado de antiguedad mayor es: " + Nomina.getElemento(indice));
                        
                        int min = 0;
                        
                        int ind = 0;
                        
                        
                        for (int i = 0; i < Nomina.getLongitud(); i++){
                          Empleados tiem = (Empleados) Nomina.getElemento(i);
                            if(tiem.getIngreso()>min){
                                min= tiem.getIngreso();
                                ind=i;
                            }
 
                        }
                        
                        System.out.println("El Empleado de menor antiguedad es: " + Nomina.getElemento(ind));
                        
                        System.out.println("-------------------------------------------");

		} catch (IOException e) {
            System.err.println(e.getMessage());
            
            //segun las indicaciones esta bien, pero no me deja correr el programa porque el main esta mal :c
    }
    
    }
}
