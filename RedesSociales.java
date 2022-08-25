
package com.mycompany.estructuradedatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class RedesSociales {
		
	    public static void main(String[] args) {
		
		File csvFile = new File("C:\\Users\\Valentina UwU\\Documents\\datosEstructura1.csv");
		try {
			Scanner sc = new Scanner(csvFile);
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				System.out.print(sc.next() + "  ");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
                Scanner sc = new Scanner (System.in);
                String respUsuario = "";
                boolean continuarCond = true;


                while (continuarCond){
                
                 System.out.println("elige la opcion que quieras realizar");
                    System.out.println("1 para ver la diferencia de seguidores de twitter");
                    System.out.println("2 para ver la diferencia de visualizaciones de youtube");
                    System.out.println("3 para ver el porcentaje de crecimiento de facebook y twitter");
                    System.out.println("4 para cerrar el programa");
                      respUsuario = sc.nextLine();
                      System.out.println("has elegido la opcion: " + respUsuario);
                      
                      switch(respUsuario){
                      case "1":
                          System.out.println("seguidores de enero a junio");
                       System.out.println("62404;63232;64149;65410;66355;67496");
                          
                       break;
                       
                       case"2":
                           System.out.println("visaulizaciones de enero a junio");
                           System.out.println("12226;15605;19602;19452;21805;17344");
                       break;
                       
                       case "3":
                           System.out.println("crecimiento de facebook de enero a junio");
                           System.out.println("0.43%,3.09%, 2.27%, 2.78%, 3.11%,4.44%");
                           System.out.println("crecimiento de Twitter de enero a junio");
                           System.out.println("1.38%, 1.31%, 1.43%, 1.93%, 1.42%, 1.69%");
                           break;
                       case "4":
                           System.out.println("gracias por haber consultado");
                           continuarCond = false;
                            break;
                      }

	}
            } 
}		
     
                
    

   

