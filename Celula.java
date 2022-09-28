/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewPackageProyectosEstructura;

/**
 *
 * @author Valentina UwU
 */
public class Celula {
     private boolean vida;
	    private int numVecinosVivos, posRen, posCol;

	    public Celula(int posRenglon, int posColumna) {
	        this.vida = false;
	        this.numVecinosVivos = 0;
	        this.posRen = posRenglon;
	        this.posCol = posColumna;
	    }

	    public boolean conVida() {
	        return vida;
	    }

	    public void setVida(boolean vida) {
	        this.vida = vida;
	    }

	    public int getNumVecinosVivos() {
	        return numVecinosVivos;
	    }

	    public void setNumVecinosVivos(int numVecinosVivos) {
	        this.numVecinosVivos = numVecinosVivos;
	    }

	    public int getPosRenglon() {
	        return posRen;
	    }

	    public void setPosRenglon(int posRenglon) {
	        this.posRen = posRenglon;
	    }

	    public int getPosColumna() {
	        return posCol;
	    }

	    public void setPosColumna(int posColumna) {
	        this.posCol = posColumna;
	    }

	    @Override
	    public String toString() {
	        
	       
	        String cadena;
	        if(vida){
	            cadena = " 0 ";
	        }else{
	           cadena = " / ";
	        }
	        return cadena;
	    }
}
