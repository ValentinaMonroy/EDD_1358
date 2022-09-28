/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NewPackageProyectosEstructura;

/**
 *
 * @author Valentina UwU
 */
public class JuegoDeLaVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Tabla t = new Tabla();
	       
	       
	        System.out.println("------------------------");
	        
	        System.out.println(t.getTabla());
	        for(int i=0; i<7;i++){
	            t.reglas();
	            t.contarVecinos();
	            System.out.println("Generacion: " + i + "\n" + t.getTabla());
	        }
	        System.out.println("------------------------");    
	    }
    }
    

