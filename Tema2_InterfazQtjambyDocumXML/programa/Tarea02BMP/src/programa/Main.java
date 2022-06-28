/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;
import com.trolltech.qt.gui.*;
/**
 *
 * @author benmu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//ABRIMOS EL FORMULARIO PRINCIPAL
        // TODO code application logic here
        QApplication.initialize(args);
        QMainWindow mw = new QMainWindow();
        Frame_Principal principal = new Frame_Principal();
        principal.setupUi(mw);
        mw.show();
        QApplication.execStatic();
    }
    
}
