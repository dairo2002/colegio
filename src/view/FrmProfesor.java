/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.estudianteController;
import controller.profesorController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Profesor;

/**
 *
 * @author Dairo Santana
 */
public class FrmProfesor extends javax.swing.JFrame {

    public profesorController profesor = new profesorController();
    public List<Profesor> lista = new ArrayList<>();
    public int idProfesor;
    
    public FrmProfesor() {
        initComponents();
        setLocationRelativeTo(this);
        cargarTabla();
    }

    public void limpiar() {
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
    }

    public void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaProfesor.getModel();
        modelo.setRowCount(0);
//        profesorController listar = new profesorController();
//        List<Profesor> listas = listar.listaProfesor();
        lista = profesor.listaProfesor();
        lista.forEach((element) -> modelo.addRow(new Object[]{
            element.getIdentificaion(),
            element.getNombre(),
            element.getApellido(),
            element.getEdad()}));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel96 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProfesor = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel96.setBackground(new java.awt.Color(183, 183, 183));

        jPanel97.setBackground(new java.awt.Color(0, 85, 142));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Registar Profesor");

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel97Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Identificaciòn");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Nombre");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Apellido");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Edad");

        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(0, 0, 0));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));

        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaProfesor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tablaProfesor.setForeground(new java.awt.Color(0, 0, 0));
        tablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Apellido", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProfesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProfesor.setSelectionBackground(new java.awt.Color(50, 129, 185));
        tablaProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProfesorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProfesor);

        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnMenu.setText("Menú  ");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtEdad)))
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel96Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAgregar)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtIdentificacion.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtEdad.getText().isEmpty()) {
            String resultado = profesor.agregar(txtIdentificacion.getText(), txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtEdad.getText()));
            JOptionPane.showMessageDialog(null, resultado);
            //Llamamos Metodos
            limpiar();
            cargarTabla();
            //Bloqueo de botones
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
//        if (!txtIdentificacion.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtEdad.getText().isEmpty()) {
//            boolean resultado = estudiante.modificar(this.idEstudiante, txtIdentificacion.getText(), txtNombre.getText(), txtApellido.getText(), Integer.parseInt(txtEdad.getText()));
//            if (resultado) {
//                JOptionPane.showMessageDialog(null, "Los datos han sido modificados");
//                limpiar();
//                cargarTabla();
//            } else {
//                JOptionPane.showMessageDialog(null, "Los datos no fueron modificados");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios,Seleccione un elemento de la tabla");
//        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        if (!txtIdentificacion.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtEdad.getText().isEmpty()) {
//            boolean resultado = estudiante.eliminar(this.idEstudiante);
//            if (resultado) {
//                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
//                cargarTabla();
//                limpiar();
//            } else {
//                JOptionPane.showMessageDialog(null, "Error no se puedo eliminar el estdudiante");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios,Seleccione un elemento de la tabla");
//        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProfesorMouseClicked
        //int seleccionar = tblaEstudiante.getSelectedRow();
        int seleccionar = tablaProfesor.rowAtPoint(evt.getPoint());
        /**
         * Cargar los datos en los campos de texto. cuando el usuario seleccione
         * un elemto de la tabla va a tomar los 5 campos
         * id,identificacion,nombre,apellido,edad se procede a hacer las
         * validaciones para que los datos cargen en cada campo de texto.
         *
         * @id: el id es oculto en la tabla, se crea una variable idEstudiante,
         * que va hacer como remplazo de id. Valimos que cuando el usuario
         * seleccione un elemento de la tabla, por medio de la lista se le pasa
         * el id. Los otros campos, con los setText se hace los datos.
         */
        idProfesor = lista.get(seleccionar).getId();
        txtIdentificacion.setText(String.valueOf(tablaProfesor.getValueAt(seleccionar, 0)));
        txtNombre.setText(String.valueOf(tablaProfesor.getValueAt(seleccionar, 1)));
        txtApellido.setText(String.valueOf(tablaProfesor.getValueAt(seleccionar, 2)));
        txtEdad.setText(String.valueOf(tablaProfesor.getValueAt(seleccionar, 3)));
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnAgregar.setEnabled(false);
    }//GEN-LAST:event_tablaProfesorMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaProfesor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
