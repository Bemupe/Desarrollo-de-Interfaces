/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbarextended;

import java.awt.Component;
import java.beans.*;

/**
 *
 * @author benmu
 */
public class ProgressBarPropertyEditor extends PropertyEditorSupport {
    ProgressBarPanel rangoPanel;
    
    public ProgressBarPropertyEditor() {
        rangoPanel=new ProgressBarPanel();
        
    }

    @Override
    public boolean supportsCustomEditor() {
        return true; 

    }

    @Override
    public Component getCustomEditor() {
        return rangoPanel; 
    }

        @Override
    public Object getValue() {
        return rangoPanel.getSelectedValue(); 
        
    }
    
    
    @Override
    public String getJavaInitializationString() {
        Rangos rangos=(Rangos)getValue();
        return ("new progressbarextended.Rangos(" + rangos.getRango1() + ", " + rangos.getRango2() + ")"); 
    }
}


    
    

