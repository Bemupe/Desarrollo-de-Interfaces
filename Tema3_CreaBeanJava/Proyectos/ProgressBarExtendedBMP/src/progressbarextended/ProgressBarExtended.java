/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbarextended;

import java.awt.Color;
import java.io.Serializable;
import java.util.EventListener;
import java.util.EventObject;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author benmu
 */
public class ProgressBarExtended extends JProgressBar implements Serializable {
    
    public RangoAlcanzadoListener listener;
    
   
    //Poner getter y setter en orden, por cada variable, su setter y su getter.
    //Rangos getter y setter
    private Rangos rangos;

    public Rangos getRangos() {
        return this.rangos;
    }

    public void setRangos(Rangos rangos) {
        this.rangos = rangos;
 
    }
   
    //Color1 getter y setter
    private Color color1;

    public Color getColor1() {
        return this.color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }
    
   //Color2 getter y setter
    private Color color2;

    public Color getColor2() {
        return this.color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
   
    //Color3 getter y setter
    private Color color3;

    public Color getColor3() {
        return this.color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }
    
    
     //CLASE QUE IMPLEMENTA LOS EVENTOS 
    public class RangoAlcanzado extends EventObject {
    
        // constructor
        public RangoAlcanzado(Object source)
        {
        super(source);
        }
    }
    
    //DECLARAR UNA INTERFAZ
    public interface RangoAlcanzadoListener extends EventListener {
    //Definimos tres métodos
        public void capturarZona1Alcanzada (RangoAlcanzado ev);
        public void capturarZona2Alcanzada (RangoAlcanzado ev);
        public void capturarZona3Alcanzada (RangoAlcanzado ev);
    } 
    
    //DECLARAMOS DOS MÉTODOS, UNO PARA AGREGAR Y OTRO PARA ELIMINAR
    public void addRangoAlcanzadoListener (RangoAlcanzadoListener add){}
    public void removeRangoAlcanzadoListener (RangoAlcanzadoListener remove){}
    
    
    //CONSTRUCTOR SIN PARÁMETROS
    public ProgressBarExtended () {
       
       
       // Definimos los intervalos 
        rangos = new Rangos(50, 75);

      // Añadimos ChangeListener y redefinimos el método stateChanged
        this.addChangeListener(new ChangeListener() {

            @Override

            public void stateChanged(ChangeEvent e) {

                comprobarZona();
            }     
        });   
    }

     //Método comprobarZona
                private void comprobarZona() 
            {
                //RANGO 1
                if (this.getValue()<Rangos.rango1)
                { 
                    setForeground(color1);   
                }
                
                //Panel de advertencia zona 1
                if (this.getValue()==Rangos.rango1-1){JOptionPane.showMessageDialog(null,"Se ha alcanzado la zona 1","ZONA 1", JOptionPane.WARNING_MESSAGE);}
                    
                //Evento zona 1
                if(this.getValue()==Rangos.rango1-1)       
                {
                    if (listener!=null)
                    {
                        listener.capturarZona1Alcanzada(new RangoAlcanzado(this));      
                    }
                }
                        
                        
                //RANGO 2
                if ((this.getValue()>=Rangos.rango1)&&(this.getValue()<=Rangos.rango2)) 
                {
                    setForeground(color2);
                }
                
                //Panel de advertencia zona 2
                if (this.getValue()==Rangos.rango1){JOptionPane.showMessageDialog(null,"Se ha alcanzado la zona 2","ZONA 2", JOptionPane.WARNING_MESSAGE);}
                
                //Evento zona 2
                if (this.getValue()==Rangos.rango1||this.getValue()==Rangos.rango2)
                {
                    if (listener!=null)      
                    {
                        listener.capturarZona2Alcanzada(new RangoAlcanzado(this));
                        
                    }
                }
                
                //RANGO 3
                if ((this.getValue()>Rangos.rango2))
                {
                    setForeground(color3); 
                }
                
                //Panel de advertencia zona 3
                if (this.getValue()==Rangos.rango2+1){JOptionPane.showMessageDialog(null,"Se ha alcanzado la zona 3","ZONA 3", JOptionPane.WARNING_MESSAGE);}
                
                //Evento zona 3
                if (this.getValue()==Rangos.rango2+1)
                {
                    if (listener!=null)      
                    {
                        listener.capturarZona3Alcanzada(new RangoAlcanzado(this));
                        
                    }
                }
            
            }
    
}
