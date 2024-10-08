package GUI;

import a.proyectohospital.Empleado;
import a.proyectohospital.Medico;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */

public class MedicoGUI extends javax.swing.JFrame {

    public Empleado medicoEmpleado;

    /**
     * Creates new form Medico
     */
    public MedicoGUI() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEspecialidad = new javax.swing.JLabel();
        jLabelHijos = new javax.swing.JLabel();
        jComboBoxHijos = new javax.swing.JComboBox<>();
        jLabelIdProfesional = new javax.swing.JLabel();
        jTextFieldIdProfesional = new javax.swing.JTextField();
        jButtonSaveMedico = new javax.swing.JButton();
        jButtonCloseMedico = new javax.swing.JButton();
        jComboBoxEspecialidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldBonificacion = new javax.swing.JTextField();
        jComboBoxMedicoCita = new javax.swing.JComboBox<>();
        jLabelEspecialidad1 = new javax.swing.JLabel();
        jButtonFindDoc = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jLabelHijos1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEspecialidad.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabelEspecialidad.setText("ESPECIALIDAD");
        jPanel1.add(jLabelEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabelHijos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabelHijos.setText("¿TIENE HIJOS MENORES");
        jPanel1.add(jLabelHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jComboBoxHijos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jComboBoxHijos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Si", "No" }));
        jComboBoxHijos.setToolTipText("Elige una opcion");
        jPanel1.add(jComboBoxHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 40));

        jLabelIdProfesional.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabelIdProfesional.setText("IDENTIFICACION");
        jPanel1.add(jLabelIdProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jTextFieldIdProfesional.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTextFieldIdProfesional.setToolTipText("Digitar identificacion del medico");
        jPanel1.add(jTextFieldIdProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 157, -1));

        jButtonSaveMedico.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonSaveMedico.setText("GUARDAR");
        jButtonSaveMedico.setToolTipText("Guardar informacion salarial");
        jButtonSaveMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveMedicoMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSaveMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 102, 31));

        jButtonCloseMedico.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonCloseMedico.setText("CERRAR");
        jButtonCloseMedico.setToolTipText("Cerrar ventana");
        jButtonCloseMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCloseMedicoMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonCloseMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 102, 31));

        jComboBoxEspecialidad.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jComboBoxEspecialidad.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "General", "Especialista" }));
        jComboBoxEspecialidad.setToolTipText("Selecciona especialidad del medico");
        jPanel1.add(jComboBoxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 128, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setText("MEDICO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectoHospital\\src\\main\\java\\Imagenes\\Medico.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("BONIFICACION");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jTextFieldBonificacion.setEditable(false);
        jTextFieldBonificacion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTextFieldBonificacion.setToolTipText("Calculo total de salario con bonificacion");
        jPanel1.add(jTextFieldBonificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 201, -1));

        jComboBoxMedicoCita.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jComboBoxMedicoCita.setToolTipText("");
        jComboBoxMedicoCita.setAlignmentX(0.0F);
        jComboBoxMedicoCita.setAlignmentY(0.0F);
        jPanel1.add(jComboBoxMedicoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 144, 26));

        jLabelEspecialidad1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabelEspecialidad1.setText("MEDICO");
        jPanel1.add(jLabelEspecialidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jButtonFindDoc.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\ProyectoHospital\\src\\main\\java\\Imagenes\\find.png")); // NOI18N
        jButtonFindDoc.setToolTipText("Buqueda Con Identifiacion");
        jButtonFindDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFindDocMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonFindDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jButtonNew.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonNew.setText("CONSULTAR NUEVA BONIFICACION");
        jButtonNew.setToolTipText("Nueva busqueda con nuevo medico");
        jButtonNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNewMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, 31));

        jLabelHijos1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabelHijos1.setText("DE 7 AÑOS?");
        jPanel1.add(jLabelHijos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseMedicoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonCloseMedicoMouseClicked
        this.dispose();
    }// GEN-LAST:event_jButtonCloseMedicoMouseClicked

    private void jButtonSaveMedicoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonSaveMedicoMouseClicked
        if (jComboBoxMedicoCita.getSelectedItem().toString().startsWith("---")) {
            JOptionPane.showMessageDialog(null, "Seleccione un Medico");
            return;
        }

        if (jComboBoxEspecialidad.getSelectedItem().toString().startsWith("---")) {
            JOptionPane.showMessageDialog(null, "Ingrese una Especialidad");
            return;
        }

        if (jComboBoxHijos.getSelectedItem().toString().startsWith("---")) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion de Hijos");
            return;
        }

        if (jTextFieldIdProfesional.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese una id Tarjeta Profesional");
            return;
        }

        Medico objMedico = new Medico();
        objMedico.setDatEmpleado(this.medicoEmpleado);

        objMedico.setEspecialidad(jComboBoxEspecialidad.getSelectedItem().toString());
        objMedico.setHijosMenores7(jComboBoxHijos.getSelectedItem().toString());

        if (objMedico.almacenarDatosMedico(objMedico)) {
            jTextFieldBonificacion.setText(Double.toString(objMedico.calcularBonificacion(objMedico)));
            JOptionPane.showMessageDialog(null, "Dato almacenado correctamente");

            return;
        }

        if (objMedico.existeMedico(Integer.parseInt(jTextFieldIdProfesional.getText()))) {
            JOptionPane.showMessageDialog(null, "El medico ya existe");
            return;
        }

    }// GEN-LAST:event_jButtonSaveMedicoMouseClicked

    private void jButtonFindDocMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonFindDocMouseClicked
        if (jTextFieldIdProfesional.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese una Identificacion");
            return;
        }

        try {
            int id = Integer.parseInt(jTextFieldIdProfesional.getText());
            if (id > 999999999) {
                JOptionPane.showMessageDialog(null, "Identificacion no Valida");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico valido en Identificacion");
            return;
        }

        Medico objMedico = new Medico();
        Empleado objEmpleado = new Empleado();
        objEmpleado = objMedico.getMedicoxId(Integer.parseInt(jTextFieldIdProfesional.getText()));

        if (objEmpleado != null) {
            if (!objEmpleado.getCargo().contains("Medico")) {
                JOptionPane.showMessageDialog(null, "El empleado No Es Un Empleado De Tipo Medico");
                jTextFieldIdProfesional.setText("");
                jTextFieldIdProfesional.hasFocus();
                return;

            }
            jComboBoxMedicoCita.setSelectedItem(objEmpleado.getNombre());

            this.medicoEmpleado = objEmpleado;
        } else {
            JOptionPane.showMessageDialog(null, "El Medico No Existe, Se Debe Crear Primero Como Empleado");
        }
        objMedico = objMedico.objexisteMedico(Integer.parseInt(jTextFieldIdProfesional.getText()));
        if (objMedico != null) {
            jComboBoxEspecialidad.setSelectedItem(objMedico.getEspecialidad());
            jComboBoxHijos.setSelectedItem(objMedico.getHijosMenores7());

            jTextFieldBonificacion.setText(Double.toString(objMedico.calcularBonificacion(objMedico)));

        }

    }// GEN-LAST:event_jButtonFindDocMouseClicked

    private void jButtonNewMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonNewMouseClicked
        clear();
    }// GEN-LAST:event_jButtonNewMouseClicked

    private void clear() {
        jTextFieldIdProfesional.setText("");
        jComboBoxMedicoCita.setSelectedItem(null);
        jComboBoxEspecialidad.setSelectedItem(null);
        jComboBoxHijos.setSelectedItem(null);
        jTextFieldBonificacion.setText("");

    }

    private void loadData() {
        List<Empleado> listaMedicos = new ArrayList<>();
        Empleado objEmpleado = new Empleado();
        listaMedicos = objEmpleado.getMedicos();

        DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<String>();
        defaultComboBoxModel.addElement("------------------------");
        for (Empleado empleado : listaMedicos) {
            defaultComboBoxModel.addElement(empleado.getNombre());
        }

        jComboBoxMedicoCita.setModel(defaultComboBoxModel);
        jComboBoxMedicoCita.setRenderer(new MedicoListCellRender());

    }

    private class MedicoListCellRender extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            if (value instanceof Empleado) {
                // Empleado objEmpleado = (Empleado) value;
                // value = objEmpleado.getNombre();}
                value = ((Empleado) value).getNombre();

            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); // Generated from
                                                                                                     // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseMedico;
    private javax.swing.JButton jButtonFindDoc;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonSaveMedico;
    private javax.swing.JComboBox<String> jComboBoxEspecialidad;
    private javax.swing.JComboBox<String> jComboBoxHijos;
    private javax.swing.JComboBox<String> jComboBoxMedicoCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEspecialidad;
    private javax.swing.JLabel jLabelEspecialidad1;
    private javax.swing.JLabel jLabelHijos;
    private javax.swing.JLabel jLabelHijos1;
    private javax.swing.JLabel jLabelIdProfesional;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBonificacion;
    private javax.swing.JTextField jTextFieldIdProfesional;
    // End of variables declaration//GEN-END:variables
}
