package numcomplejo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


//Hacemos un main que crea un documento txt (Docu_NumComplejo.txt) en la ruta del proyecto, y el mismo resultado aparece por pantalla, 
//con todas las operaciones realizadas.
public class PruebasUnit {

    public static void main(String[] args){
        
        NumComplejo pruebaNum1, pruebaNum2, result;//Objetos "NumComplejo"
        
        String resultado="";//String donde se almacena el resultado
        
        pruebaNum1  = new NumComplejo (3.0,+2.0);
        
        pruebaNum2  = new NumComplejo (-1.0,+2.0);
        
        result = new NumComplejo();
        
        String ruta = System.getProperty("user.dir") + "/Docu_NumComplejo.txt";//Ruta del archivo Docu_NumComplejo.txt, según donde se encuentre el directorio.
 
        try
            (//Establecemos los objetos para realizar la escritura del archivo "Docu_NumComplejo.txt"
                FileWriter fichero = new FileWriter(ruta);//Creamos el archivo "Docu_NumComplejo.txt", que la establecemos según el string "ruta".
            
                BufferedWriter bw = new BufferedWriter(fichero);//Buffer para escribir en el fichero.
           
                PrintWriter pw = new PrintWriter(bw)//Objeto que realiza la escritura en el archivo "Docu_NumComplejo.txt"
                )
        
        {   //Panel inicial
            System.out.println("---------------------------");
        
            pw.println("---------------------------");  
        
            System.out.println("PRUEBAS UNITARIAS CON JUNIT");
        
            pw.println("PRUEBAS UNITARIAS CON JUNIT");    
        
            System.out.println("---------------------------");
        
            pw.println("---------------------------");
            
            
            //Impresión de resultados "Suma" por pantalla y al archivo "Docu_NumComplejo.txt"
            System.out.println("Suma: numcomplejo.sumarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)+(-1.0+2.0i)");        
        
            pw.println("Suma: numcomplejo.sumarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)+(-1.0+2.0i)");
        
            resultado=result.sumarComplejos(pruebaNum1, pruebaNum2).toString();//Utilizamos el método correspondiente
        
            System.out.println(resultado);
        
            pw.println(resultado);
        
            System.out.println();
        
            pw.println(" ");
        
            System.out.println();
        
            pw.println(" ");
            
            
            //Impresión de resultados "Resta" por pantalla y al archivo "Docu_NumComplejo.txt"
            System.out.println("Resta: numcomplejo.restarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)-(-1.0+2.0i)");
        
            pw.println("Resta: numcomplejo.restarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)-(-1.0+2.0i)");
        
            resultado=result.restarComplejos(pruebaNum1, pruebaNum2).toString();
        
            System.out.println(resultado);
        
            pw.println (resultado);
        
            System.out.println();
        
            pw.println(" ");
        
            System.out.println();
        
            pw.println(" ");
        
            
            //Impresión de resultados "Resta" por pantalla y al archivo "Docu_NumComplejo.txt"
            System.out.println("Multiplicación: numcomplejo.multiplicarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)*(-1.0+2.0i)");
        
            pw.println ("Multiplicación: numcomplejo.multiplicarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)*(-1.0+2.0i)");
        
            resultado=result.multiplicarComplejos(pruebaNum1, pruebaNum2).toString();
        
            System.out.println(resultado);
        
            pw.println (resultado);
        
            System.out.println();
        
            pw.println(" ");
        
            System.out.println();
        
            pw.println(" ");
        
            
            //Impresión de resultados "División" por pantalla y al archivo "Docu_NumComplejo.txt"
            System.out.println("División: numcomplejo.dividirComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)/(-1.0+2.0i)");
       
            pw.println ("División: numcomplejo.dividirComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)/(-1.0+2.0i)");
        
            resultado=result.dividirComplejos(pruebaNum1, pruebaNum2).toString();
        
            System.out.println(resultado);
        
            pw.println (resultado);
        
            System.out.println();
        
            pw.println(" ");
        
            System.out.println();
        
            pw.println(" ");
        
        
            //Impresión de "Excepción Indeterminada" por pantalla y al archivo "Docu_NumComplejo.txt"
            System.out.println("División (Indeterminado): numcomplejo.dividirComplejos(3.0+2.0i, 0.0+0.0i) >>> (3.0+2.0i / 0.0+0.0i)");
        
            pw.println ("División (Indeterminado): numcomplejo.dividirComplejos(3.0+2.0i, 0.0+0.0i) >>> (3.0+2.0i / 0.0+0.0i)");
        
            NumComplejo pruebaIndeNum1  = new NumComplejo (3.0,+2.0);
        
            NumComplejo pruebaindeNum2  = new NumComplejo (0.0,+0.0);
        
            NumComplejo resultInde = new NumComplejo();
        
            resultInde.dividirComplejos(pruebaIndeNum1, pruebaindeNum2).toString();
            
            //Cerramos fichero, el buffer y el printerWriter.
            bw.close();
            pw.close();
            fichero.close();
        
        }catch(ArithmeticException a) {
            
            //Volvemos a crear un try-catch para introducir el texto de la excepción ArithmeticException en la caso de divisor=0
            try (
                    //Abrimos de nuevo el fichero, bw y pw. En este caso abrimos "FileWriter"
                    FileWriter fichero = new FileWriter(ruta,true);//Creamos el archivo "acta.txt", que la establecemos según el string "rutaActa", en el cual añadiremos las notas de los alumnos
            
                    BufferedWriter bw = new BufferedWriter(fichero);
           
                    PrintWriter pw = new PrintWriter(bw))
            {
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            
                pw.println ("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            
                System.out.println("Ha ocurrido una excepción aritmética: "+a.getMessage());
           
                pw.println ("Ha ocurrido una excepción aritmética: "+a.getMessage());
            
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            
                pw.println ("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                
                //Cerramos fichero, el buffer y el printerWriter.
                bw.close();
                pw.close();
                fichero.close();
            
            }catch(Exception e) {
                
                System.out.println("Error"+e.getMessage());
            }
                //Excepción en caso de error en fila.
        } catch (FileNotFoundException b) {
            
            System.out.println("Error archivo no encontrado "+b.getMessage()); 
                //Manejo de una excepción de entrada/salida
        } catch (IOException c) {
            
            System.out.println("Error en la entrada/salida de datos "+c.getMessage());
                //Manejo de cualquier excepción
        } catch (Exception d) {
            
           System.out.println("Error "+d.getMessage());
           
               
        }
}
}
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    

