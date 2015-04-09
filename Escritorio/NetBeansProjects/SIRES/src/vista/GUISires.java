/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlSIRES;
import java.awt.event.ActionListener;

/**
 *
 * @author Mariela Cortes C
 */
public class GUISires extends javax.swing.JFrame {

    /**
     * Creates new form GUISires
     */
    public GUISires() {
        initComponents();
        ControlSIRES control=new ControlSIRES ();
        this.escucharMenuItem(control);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbSIRES = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        mnResgistro = new javax.swing.JMenu();
        mniRegistroEstudiaante = new javax.swing.JMenuItem();
        mniCursos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnArchivo.setText("Archivo");

        mniSalir.setText("Salir");
        mnArchivo.add(mniSalir);

        mbSIRES.add(mnArchivo);

        mnResgistro.setText("Registro");

        mniRegistroEstudiaante.setText("Registro estudiantes");
        mnResgistro.add(mniRegistroEstudiaante);

        mniCursos.setText("Registro Cusrsos");
        mnResgistro.add(mniCursos);

        mbSIRES.add(mnResgistro);

        setJMenuBar(mbSIRES);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUISires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISires().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mbSIRES;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnResgistro;
    private javax.swing.JMenuItem mniCursos;
    private javax.swing.JMenuItem mniRegistroEstudiaante;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables

    
    public static final String MNI_SALIR="Salir";
    public static final String MNI_REGISTRO_ESTUDIANTES="Registro estudiantes";
    public static final String MNI_REGISTRO_CURSOS="Registro Cusrsos";
    
    public void escucharMenuItem (ActionListener control)
    {
     this.mniSalir.addActionListener (control);
     this.mniRegistroEstudiaante.addActionListener (control);
     this.mniCursos.addActionListener (control);
    }
}
