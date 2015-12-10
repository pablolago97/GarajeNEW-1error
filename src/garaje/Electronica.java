
package garaje;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Electronica {
    private int numeroCoches;
    private String matricula;
    private float precio;
    private String ticket;

    public Electronica() {
    }

    public Electronica(int numeroCoches, String matricula, float precio, String ticket) {
        this.precio = precio;
        this.numeroCoches = numeroCoches;
        this.matricula = matricula;
        this.ticket = ticket;
    }
    
    public void insertarCoches (){
        numeroCoches++;
    }
    
    public void retirarCoches (){
        numeroCoches--;
    }
    
    public void comprobarSitio(){
        if(numeroCoches>=3){
            JOptionPane.showMessageDialog(null, "No hay sitio, no puede aparcar");   
        }else if(numeroCoches<3&&numeroCoches>=0){
            JOptionPane.showMessageDialog(null, "Hay sitio, puede aparcar");
        }else 
            JOptionPane.showMessageDialog(null, "~~#ERROR");
    }
    
    public String getMatricula(){
       matricula = JOptionPane.showInputDialog("Introduzca matrícula de coche");
       return matricula;
    }
    
    public float getPrecio(){
       precio = Float.parseFloat(JOptionPane.showInputDialog("Introduce las horas que vas a estar"));
       if (precio==3){
           JOptionPane.showMessageDialog(null, "Tienes que pagar 3 Euros");
       }else if (precio>3){
           JOptionPane.showMessageDialog(null, "Tienes que pagar 3 Euros más"+" "+((precio-3)*0.20)+" "+"por el plus de tiempo");
       }else
           JOptionPane.showMessageDialog(null, "Te saldrá gratis, cabroncete");
        return precio;
    }
    
    public void ticket (){
        JOptionPane.showMessageDialog(null, "FACTURA\n\nMatrícula"+" "+matricula+"\n\nTiempo"+" "+precio+"\n\nGracias por usar nuestro parking");
        
    }
    
    
    
}
