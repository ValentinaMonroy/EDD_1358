/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewPackageProyectosEstructura;

/**
 *
 * @author Valentina UwU
 */
public class Tabla {
     private Arreglo tabla;

	    public Tabla() {
	
	    	tabla = new Arreglo(10, 10);
	        for (int col = 0; col < 10; col++)
	        {
	            for (int ren = 0; ren < 10; ren++)
	            {
	                tabla.setElemento(ren, col, new Celula(ren, col));
	            }
	        }

	        Celula var;
	        var = (Celula) tabla.getElemento(1, 1);
	        var.setVida(true);
	        var = (Celula) tabla.getElemento(2, 2);
	        var.setVida(true);
	        var = (Celula) tabla.getElemento(2, 8);
	        var.setVida(true);
	        var = (Celula) tabla.getElemento(2, 1);
	        var.setVida(true);
	        var = (Celula) tabla.getElemento(3, 6);
	        var.setVida(true);
	        ;
	        

	        contarVecinos();
	    }

	    public void contarVecinos() {

	        for (int col = 0; col < 10; col++)
	        {
	            for (int ren = 0; ren < 10; ren++)
	            {
	                Celula actual = (Celula) tabla.getElemento(ren, col);
	                if (col > 0 && col < 9 && ren > 0 && ren < 9)
	                {

	                    for (int c = col - 1; c <= col + 1; c++)
	                    {
	                        for (int r = ren - 1; r <= ren + 1; r++)
	                        {
	                            Celula t = (Celula) tabla.getElemento(r, c);
	                            if (t.conVida() && !(c == col && r == ren))
	                            {
	                                actual.setNumVecinosVivos(actual.getNumVecinosVivos() + 1);
	                            }
	                        }
	                    }

	                } else
	                {

	                    int cCol, cRen, mxCol,mxRen;
	                    
	                    if(col==0){
	                    	cCol = 0;
	                    	mxCol = 2;
	                    }else if(col==9){
	                    	cCol = 8;
	                    	mxCol = 10;
	                    }else{
	                    	cCol = col-1;
	                    	mxCol = col+2;
	                    }
	                    
	                    if(ren==0){
	                    	cRen = 0;
	                    	mxRen = 2;
	                    }else if(ren==9){
	                    	cRen = 8;
	                    	mxRen = 10;
	                    }else{
	                    	cRen = ren-1;
	                    	mxRen = ren+2;
	                    }
	                    
	                    for(int i = cCol;i<mxCol;i++){
	                        for(int j = cRen; j<mxRen;j++){
	                            Celula t = (Celula) tabla.getElemento(j, i);
	                            if (t.conVida() && !(i == col && j == ren))
	                            {
	                                actual.setNumVecinosVivos(actual.getNumVecinosVivos() + 1);
	                            }
	                        }
	                    }
	                    
	                    
	                    
	                }
	            }
	        }
	    }

	    public void reglas() {

	        for (int col = 0; col < 10; col++)
	        {
	            for (int ren = 0; ren < 10; ren++)
	            {
	                Celula t = (Celula) tabla.getElemento(ren, col);
	                if (t.conVida())
	                {

	                    if (t.getNumVecinosVivos() >= 4)
	                    {
	                        t.setVida(false);
	                    } else if (t.getNumVecinosVivos() <= 1)
	                    {
	                        t.setVida(false);
	                    }

	                } else
	                {
	                    if (t.getNumVecinosVivos() == 3)
	                    {

	                        t.setVida(true);
	                    }
	                }
	            }
	        }
	    }

	    public Arreglo getTabla() {
	        return tabla;
	    }
}
