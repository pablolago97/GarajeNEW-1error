package garaje;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Garaje {


    public static void main(String[] args) {
       
        Electronica metodos = new Electronica();
        // Este programa contiene errores a la hora de cometer algún 'InputDialog'
        //que no se afilie como es debido.
        
        boolean x = true;
        
     
      do{
          int opcionParking =  Integer.parseInt(JOptionPane.showInputDialog("Hola, bienvenido al asistente automático del parking, ¿Qué desea?\n\nEntrar al parking, press 1\n\nSalir del parking, press 2\n\nSalir de la aplicación, press 3\n"));
      
            
        if(opcionParking==1){
            metodos.comprobarSitio();
            metodos.getMatricula();
            metodos.getPrecio();
            metodos.ticket();
            metodos.insertarCoches();
            }else if (opcionParking==2){
                JOptionPane.showMessageDialog(null, "¡Deicaloguiñoooo!");
                metodos.retirarCoches();
            }else{
            JOptionPane.showMessageDialog(null, "El programa se cerrará");
             x=false;
            }
      }while (x);
    }
    
}
