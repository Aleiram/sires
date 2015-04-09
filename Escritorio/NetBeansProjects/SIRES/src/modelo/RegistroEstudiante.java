/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
/**
 *
 * @author Mariela Cortes C
 */
public class RegistroEstudiante {
    ArrayList<Estudiante> listaEstudiante;
    public RegistroEstudiante ()
        {
            listaEstudiante=new ArrayList<Estudiante>();
                  
        }
    
        
    public String addEstudiante (Estudiante estudiante)
    {
        if (estudiante!=null)
        {
                if (verificarCarne (estudiante.getCarne()))
                {
                    listaEstudiante.add(estudiante);
                    return "el estudiante fue agregado correctamente";
                }
                else
                {
                    return "el estudiante ya esta agregado";
                }
           
        }
        return "el objeto esta vacio";
    }
    
    public boolean verificarCarne (String carne)
    {
        if (!carne.equalsIgnoreCase(""))
        {
            if (listaEstudiante.size()!=0)
            {
            for (int i=0 ; i<listaEstudiante.size() ; i++)
            {
               if (listaEstudiante.get(i).getCarne().equals(carne)) 
                   return false;
            }
        }
        }
        return true;
    }
    
    
    
    
    public Estudiante consultar (String carne)
    {
        for (Estudiante estudiante:listaEstudiante)
        {
            if (estudiante.getCarne().equalsIgnoreCase(carne))
            {
                return estudiante;
            }
        }
        return null;
    }
    
    
    
    
    public String consultarTodo ()
    {
        String salida="Carné\t"+"Nombre\t"+"Edad";
        for (Estudiante estudiante:listaEstudiante)
        {
            salida+=estudiante+getInformacion()+"\n";
        }
        return salida;
    }
    
    
    
    public String eliminarEstudiante (Estudiante estudiante)
    {
        listaEstudiante.remove(estudiante);
        return "el estudiante fue eliminado";
    }
}//fin de la clase