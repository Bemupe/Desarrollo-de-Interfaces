/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcomplejo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;




/** @author bemupe */

public class NumComplejoTest {
    
NumComplejo pruebaNum1, pruebaNum2, result;
    
//Creamos un método que se ejecutará antes del resto de métodos, donde creamos los objetos "NumComplejo", para realizar los tests.
@Before
public void inicializar() {
    
    pruebaNum1  = new NumComplejo (3.0,+2.0);
            
    pruebaNum2  = new NumComplejo (-1.0,+2.0);
    
    result = new NumComplejo();

  }   
 
//-------------------------------------------------------------------------------------------------------------------
//ANALIZAREMOS EN CUANTO A SU EJECUCIÓN EL TEST "testSumar" (puesto que todos los test son iguales en su ejecución) 
//Y EL TEST "testIndeterminado" (es el test distinto al resto de los otros)
//-------------------------------------------------------------------------------------------------------------------
@Test
    public void testSumar() throws Exception {
        
        String resul="";
        
        //Usamos un "try-catch" donde en el "try", realizamos todas las operaciones para realizar el test. Posteriormente en los
        //"catch" utilizamos para obtener las excepciones y lanzar los fallos del test.
        try {
            System.out.println("---------------------------------");
            
            System.out.println("PRUEBA UNITARIA 'Sumar' CON JUNIT");
            
            System.out.println("---------------------------------");
            
            System.out.println("Suma: numcomplejo.sumarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)+(-1.0+2.0i)");

            resul=result.sumarComplejos(pruebaNum1, pruebaNum2).toString();//Realizamos la operación e introducimos en la variable string "resul"
            
            //Utilizamos un condicional, de tal forma que, si el resultado obtenido es igual al que hay que obtener, lo sacamos por pantalla,
            //y utilizando "assertTrue" le añadimos "true" para que salte el test como correcto. En el caso de no ser resul= "2.0+4.0i", sacamos por pantalla
            // el resultado incorrecto y usamos "assertFalse" añadiéndole "true" para mostrar que el test fue erroneo. Con este condicional obtenemos tanto información
            //del error como de la verificación tanto en pantalla como en la pantalla de "Tets passed"
            if (resul.equals("2.0+4.0i"))
            {
                System.out.println("Suma correcta, resultado: "+resul);
                
                assertTrue (true);
            
            }else{
                
                System.out.println("Suma incorrecta, resultado: "+result.sumarComplejos(pruebaNum1, pruebaNum2).toString());
                
                assertFalse (true); 
                
            }
            
            System.out.println();

        }catch (Exception e) {
            
            fail ("Se ha producido una excepción no esperada: " +e);
        
        } catch (AssertionError b) {
            
           fail ("Error en la prueba, resultado erroneo: "+resul);
        }
        
    }    
    

    @Test
    public void testRestar() throws Exception {
        
        String resul="";
         
        try {
            
            System.out.println("----------------------------------");
            
            System.out.println("PRUEBA UNITARIA 'Restar' CON JUNIT");
            
            System.out.println("----------------------------------");

            System.out.println("Resta: numcomplejo.restarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)-(-1.0+2.0i)");
            
            resul=result.restarComplejos(pruebaNum1, pruebaNum2).toString();
            
            if (resul.equals("4.0+0.0i"))
            {
                System.out.println("Resta correcta, resultado: "+resul);
                assertTrue (true);
            
            }else{
                System.out.println("Resta incorrecta, resultado: "+resul);
                assertFalse (true); 
            }

            System.out.println();
       
        }catch (Exception e) {
        
            fail ("Se ha producido una excepción no esperada: " +e);
        
        } catch (AssertionError b) {
            
            fail ("Error en la prueba, resultado erroneo: "+resul);
        }
        
    }

 @Test
    public void testMultiplicar() throws Exception {
        
        String resul="";
        
        try {
            System.out.println("---------------------------------------");
            
            System.out.println("PRUEBA UNITARIA 'Multiplicar' CON JUNIT");
            
            System.out.println("---------------------------------------");

            System.out.println("Multiplicación: numcomplejo.multiplicarComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)*(-1.0+2.0i)");
            
            resul=result.multiplicarComplejos(pruebaNum1, pruebaNum2).toString();
            
            if (resul.equals("-7.0+4.0i"))
            {
                System.out.println("Multiplicación correcta, resultado: "+resul);
                
                assertTrue (true);
            
            }else{
                
                System.out.println("Multiplicación incorrecta, resultado: "+resul);
                
                assertFalse (true); 
            }
            
            System.out.println();
        
        }catch (Exception e) {
            fail ("Se ha producido una excepción no esperada: " +e);
        
        }catch (AssertionError b) {
            
            fail ("Error en la prueba, resultado erroneo: "+resul);
        }
        
    }

    @Test
    public void testDividir() throws Exception {
        
        String resul="";
        
        try {
            System.out.println("-----------------------------------");
            
            System.out.println("PRUEBA UNITARIA 'Dividir' CON JUNIT");
            
            System.out.println("-----------------------------------");

            System.out.println("División: numcomplejo.dividirComplejos(3.0+2.0i, -1.0+2.0i) >>> (3.0+2.0i)/(-1.0+2.0i)");
            
            resul=result.dividirComplejos(pruebaNum1, pruebaNum2).toString();
            
            if (resul.equals("0.2-1.6i"))
            {
                System.out.println("División correcta, resultado: "+resul);
                
                assertTrue (true);
            
            }else{
                
                System.out.println("División incorrecta, resultado: "+resul);
                
                assertFalse (true); 
            }
            
            System.out.println();
        
        }catch (Exception e) {
            fail ("Se ha producido una excepción no esperada: " +e);
        
        }catch (AssertionError b) {
            
            fail ("Error en la prueba, resultado erroneo: "+resul);
        }
    }
      
        
    @Test
    public void testIndeterminado() throws Exception {
        
        String resul="";
        
        //El caso del testIndeterminado es algo diferente al resto. Seguimos utilizando un try-catch, pero con la difencia que para comprobar si salta la excepción,
        //usamos un "catch" con la excepción que nos interesa, que es "ArithmeticException" y que añadimos en el método "dividirComplejos". De esta forma capturamos la 
        //excepción y comprobamos si esta salta cuando el divisor es igual a 0. Al igual que los test anteriores, tanto el error como la superación del test, 
        //aparecerán en la consola y en la pantalla de "Tets passed".
        try {
            System.out.println("---------------------------------------------");
            
            System.out.println("PRUEBA UNITARIA 'TestIndeterminado' CON JUNIT");
            
            System.out.println("---------------------------------------------");

            System.out.println("División (Indeterminado): numcomplejo.dividirComplejos(3.0+2.0i, 0.0+0.0i) >>> (3.0+2.0i / 0.0+0.0i)");
            
            NumComplejo pruebaIndeNum1  = new NumComplejo (3.0,+2.0);
            
            NumComplejo pruebaindeNum2  = new NumComplejo (0.0,+0.0);//Objeto de número complejo para que salte la excepción
            
            NumComplejo resultInde = new NumComplejo();
            
            resultInde.dividirComplejos(pruebaIndeNum1, pruebaindeNum2).toString();
        
            fail("Error la excepción no saltó");//En caso de no saltar la excepción aparecerá este mensaje de error en la pantalla de "Tets passed"
            
            System.out.println("Divisor distinto de 0: No ha saltado la excepción");
            
            System.out.println();
           
        }catch(ArithmeticException c) {//Captura de la excepción que si salta el test será correcto.
        
            assertTrue (true);
            
            System.out.println("Divisor igual a 0: Ha saltado la excepción");
            
            System.out.println();
        
        }
    
    }

}
