/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_carlosromero;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Will
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Universo
     */
    public Principal() {
        initComponents();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdCrear = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        txPlaneta = new javax.swing.JTextField();
        txRaza = new javax.swing.JTextField();
        txAnios = new javax.swing.JSpinner();
        txKi = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdModificar = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        ppmenu = new javax.swing.JPopupMenu();
        jmiEliminar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaA = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiNuevo = new javax.swing.JMenuItem();
        jmiAbrir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiModificaryEliminar = new javax.swing.JMenuItem();

        jdCrear.setMinimumSize(new java.awt.Dimension(800, 600));
        jdCrear.setPreferredSize(new java.awt.Dimension(800, 600));
        jdCrear.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jdCrear.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 120, 50));
        jdCrear.getContentPane().add(txPlaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 440, 30));
        jdCrear.getContentPane().add(txRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 440, 30));
        jdCrear.getContentPane().add(txAnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, -1));
        jdCrear.getContentPane().add(txKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 270, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Añadir Seres Vivos");
        jdCrear.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 200, 60));

        jLabel3.setText("Numero de ki:");
        jdCrear.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 20));

        jLabel4.setText("Número máximo de años:");
        jdCrear.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 130, 20));

        jLabel5.setText("Nombre del planeta:");
        jdCrear.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 110, 20));

        jLabel7.setText("Nombre de la raza:");
        jdCrear.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 110, 20));

        jdModificar.setPreferredSize(new java.awt.Dimension(800, 600));
        jdModificar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista1.setModel(new DefaultListModel());
        lista1.setToolTipText("");
        lista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista1);

        jdModificar.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 107, 568, 312));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel6.setText("Modificar y Eliminar");
        jdModificar.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 280, 50));

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        ppmenu.add(jmiEliminar);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        ppmenu.add(jmiModificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Archivo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 200, 70));

        listaA.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(listaA);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 620, 260));

        jMenu1.setText("Archivo");

        jmiNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNuevo.setText("Nuevo Universo");
        jmiNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiNuevo);

        jmiAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmiAbrir.setText("Abrir Universo");
        jmiAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAbrir);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        jmiModificaryEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmiModificaryEliminar.setText("Modificar y Eliminar");
        jmiModificaryEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificaryEliminarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiModificaryEliminar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirActionPerformed
        DefaultListModel model = new DefaultListModel();
        lista1.setModel(model);
        listaA.setModel(model);
        File fichero =null;
        ArrayList x=new ArrayList();
        try{
            JFileChooser jfc=new JFileChooser();
            FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos de texto", "txt");
            jfc.setFileFilter(filtro);
            int seleccion =jfc.showOpenDialog(this);
            if(seleccion==JFileChooser.APPROVE_OPTION){
                fichero=jfc.getSelectedFile();
                x=universo.AbrirArchivo(fichero);
                DefaultListModel modelo = new DefaultListModel();
                for (int i = 0; i < x.size(); i++) {
                    modelo.addElement(x.get(i));
                }
                lista1.setModel(modelo);
                listaA.setModel(modelo);
                universo.SetArrayList(x);
                universo.EscribirArchivo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jmiAbrirActionPerformed

    private void jmiNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        lista1.setModel(modelo);
        listaA.setModel(modelo);
        String Nombre=JOptionPane.showInputDialog(this, "\nIngrese el Nombre del Universo:\n", "Nuevo", 1);
        universo.Crear(Nombre);
        jdCrear.setModal(true);
        jdCrear.pack();
        //Color color=Color.getHSBColor(130, 224, 170);
        //jdCrear.getContentPane().setBackground(color);
        jdCrear.setLocationRelativeTo(this);
        jdCrear.setVisible(true);
        
    }//GEN-LAST:event_jmiNuevoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            String NombreDeRaza=txRaza.getText(); 
            int NumeroDeKi=((Integer)txKi.getValue()); 
            int NumeroMaximoDeAnios=((Integer) txAnios.getValue()); 
            String NombreDelPlaneta=txPlaneta.getText();
            universo.getSeresVivos().add(new SeresVivos(NombreDeRaza, NumeroDeKi, NumeroMaximoDeAnios, NombreDelPlaneta));
            DefaultListModel modelo= (DefaultListModel) lista1.getModel();
            modelo.addElement(new SeresVivos(NombreDeRaza, NumeroDeKi, NumeroMaximoDeAnios, NombreDelPlaneta));
            lista1.setModel(modelo);
            universo.EscribirArchivo();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(jdCrear, "No se Guardó el Archivo", "Error!", 0);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jmiModificaryEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificaryEliminarActionPerformed
        jdModificar.setModal(true);
        jdModificar.pack();
        jdModificar.setLocationRelativeTo(this);
        jdModificar.setVisible(true);
        
    }//GEN-LAST:event_jmiModificaryEliminarActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
       try{
       int pos=lista1.getSelectedIndex();
       universo.getSeresVivos().remove(pos);
       universo.EscribirArchivo();
       DefaultListModel modelo = new DefaultListModel();
       for (int i = 0; i < universo.getSeresVivos().size(); i++) {
            modelo.addElement(universo.getSeresVivos().get(i));
       }
       lista1.setModel(modelo);
       }catch(Exception e){
           JOptionPane.showMessageDialog(jdModificar, "No hay Selección alguna!", "Error", 0);
       } 
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
       try{
       int pos=lista1.getSelectedIndex();
       String m=JOptionPane.showInputDialog("Ingrese el Nombre De Raza:");
       universo.getSeresVivos().get(pos).setNombreDeRaza(m);
       int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de Ki"));
       universo.getSeresVivos().get(pos).setNumeroDeKi(y);
       int z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero maximo de años:"));
       universo.getSeresVivos().get(pos).setNumeroMaximoDeAnios(z);
       String n=JOptionPane.showInputDialog("Ingrese el Nombre De Planeta:");
       universo.getSeresVivos().get(pos).setNombreDelPlaneta(n);
       DefaultListModel modelo = new DefaultListModel();
       universo.EscribirArchivo();
       for (int i = 0; i < universo.getSeresVivos().size(); i++) {
            modelo.addElement(universo.getSeresVivos().get(i));
       }
       lista1.setModel(modelo);
       }catch(Exception e){
           JOptionPane.showMessageDialog(jdModificar, "No hay Selección alguna!", "Error", 0);
       } 
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void lista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista1MouseClicked
        if (evt.isMetaDown()) {
            this.ppmenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lista1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       JFileChooser jfc=new JFileChooser();
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos de texto", "txt");
        jfc.addChoosableFileFilter(filtro);
        int seleccion =jfc.showSaveDialog(this);
        
        FileWriter fw=null;
        BufferedWriter bw=null;
        if(seleccion ==JFileChooser.APPROVE_OPTION){
            try {
                File fichero=null;
                if(jfc.getFileFilter().getDescription().equals("Archivos de texto")){
                    fichero=new File(
                                     jfc.getSelectedFile().getPath()+".txt");
                }else{
                    fichero=jfc.getSelectedFile();
                }
                fw=new FileWriter(fichero);
                bw=new BufferedWriter(fw);
                bw.write(universo.Guardar());
                bw.flush();
                JOptionPane.showMessageDialog(this, "Archivo guardado Exitosamnete", "Guardado", 1);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                try {
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jdCrear;
    private javax.swing.JDialog jdModificar;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiModificaryEliminar;
    private javax.swing.JMenuItem jmiNuevo;
    private javax.swing.JList<String> lista1;
    private javax.swing.JList<String> listaA;
    private javax.swing.JPopupMenu ppmenu;
    private javax.swing.JSpinner txAnios;
    private javax.swing.JSpinner txKi;
    private javax.swing.JTextField txPlaneta;
    private javax.swing.JTextField txRaza;
    // End of variables declaration//GEN-END:variables
    Universo universo=new Universo();
    File fichero=null;
    SeresVivos sr=new SeresVivos();
}
