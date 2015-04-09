/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import modelo.RegistroEstudiante;
import vista.Botones;
import vista.GUIEstudiante;
import vista.GUIReporte;
import vista.PanelEstudiante;
/**
 *
 * @author Mariela Cortes C
 */
public class ControlEstudiante implements ActionListener {

    private RegistroEstudiante registroEstudiante;
    private PanelEstudiante panelData;
    private Botones panelBtn;
    
    
    //metodo construntor
    public ControlEstudiante (PanelEstudiante panelEstudiante,Botones panelBtn)
    {
        registroEstudiante=new RegistroEstudiante ();
        this.panelData=panelEstudiante;
        this.panelBtn=panelBtn;
    }
    
    public void actionPerformed(ActionEvent evento) {
       if (evento.getActionCommand().equalsIgnoreCase(Botones.BTN_AGREGAR)){
           if (panelData.getTxtCarne().equalsIgnoreCase(""))
                   {
                       GUIEstudiante.mensaje("El campo carné no tiene información, por agrege la informacion");
                   }
           
           else if (panelData.getTxtNombre().equalsIgnoreCase(""))
                   {
                      GUIEstudiante.mensaje("El campo nombre no tiene información, por agrege la informacion"); 
                   }
           else if (panelData.getTxtEdad()==0)
           {
               GUIEstudiante.mensaje("El campo edad no tiene información, por agrege la informacion");
           }
           
           
           
           if (panelData.getTxtCarne().equalsIgnoreCase("")
                   ||panelData.getTxtNombre().equalsIgnoreCase("")
                   ||panelData.getTxtEdad()==0)
           {
               GUIEstudiante.mensaje("Debe llenar todos los campos con la informacion del estudiante");
           }
           else
           {
               GUIEstudiante.mensaje(
               registroEstudiante.addEstudiante(new Estudiante(panelData.getTxtNombre(),panelData.getTxtEdad(),panelData.getTxtCarne())));
               panelData.limpiar();
           }
          
       }//fin de agregar
       
       
       if (evento.getActionCommand().equalsIgnoreCase (PanelEstudiante.BTN_BUSCAR))
       {
           Estudiante estudiante=registroEstudiante.consultar(panelData.getTxtCarne());
           if (estudiante!=null)
           {
            panelData.setTxtCarne (estudiante.getCarne());
            panelData.setTxtNombre (estudiante.getNombre());
            panelData.setTxtEdad (estudiante.getEdad());
            panelBtn.enableEliMod (true);
           }
       }
       else
       {
           GUIEstudiante.mensaje ("el estudiante no se encuentra registrado");
           panelData.limpiar();
       }//Fin de evento Buscar AQUI SE SUPONE DEBE CERREAR UNA LLAVE ENTES (CREO)
    
        if (evento.getActionCommand().equalsIgnoreCase(Botones.BTN_CONSULTAR))
        {
            //GUIEstudiante.mensaje(registroEstudiante.consultar(panelData.getTxtCarne())+"");
            GUIEstudiante.mensaje(registroEstudiante.consultarTodo());
            //panelData.setTxtNombre (registroEstudiante.consultar(panelData.getTxtCarne()))
            GUIReporte guiRepo=new GUIReporte ();
            guiRepo.setVisible (true);
            guiRepo.setTxaReporte (RegistroEstudiante.consultarTodo());
            
        }
        
        //array list, lista.remove(estudiante) ES PARA ELIMINAR
        //retorna estring informando "el proceso se realizo correctamente"
        
        //cargar los datos en los espacios
        //se carga el obejeto, se elimina y se hace otro
            
            
        if (evento.getActionCommand().equalsIgnoreCase(Botones.BTN_SALIR))
    {
        System.exit(0);
    }//Fin de salir
        
    }
    
    
    
    
}
