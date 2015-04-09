/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUIEstudiante;
import vista.GUISires;

/**
 *
 * @author Mariela Cortes C
 */
public class ControlSIRES implements ActionListener {
    
    
    private RegistroEstudiante registroEstrudiante;
    public ControlSIRES ()
    {
        REGISTROeSTUDIANTE=NEW rEGISTROeSTUDIANTE ();
    }
    

    public void actionPerformed(ActionEvent evento) 
    {
        if (evento.getActionCommand().equalsIgnoreCase(GUISires.MNI_SALIR));
        System.exit (0);
    }
    
    if (evento.getActionCommand().equalsIgnoreCase(GUISires.MNI_REGISTRO_ESTUDIANTES))
            {
                
                GUIEstudiante guiEstudiante=new GUIEstudiante ();
                guiEstudiante.show();
    }
}
