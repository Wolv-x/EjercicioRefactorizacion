/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.Evento.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import poo.iccr.Evento.Evento;
import poo.iccr.Evento.Salon;

public class FrmEvento extends javax.swing.JFrame {

    /**
     * Creates new form FrmEvento
     */

    Evento eventoNuevo;

    public FrmEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipoEvento = new javax.swing.ButtonGroup();
        btngTematica = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        txtNiños = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContactoCliente = new javax.swing.JTextField();
        rbtDiurno = new javax.swing.JRadioButton();
        rbtNocturno = new javax.swing.JRadioButton();
        chkEquipoSonido = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        rbtFormal = new javax.swing.JRadioButton();
        rbtInformal = new javax.swing.JRadioButton();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAdultos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        chkMenajePremium = new javax.swing.JCheckBox();
        chkAnimacion = new javax.swing.JCheckBox();
        chkCocteleria = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Responsable");

        jLabel2.setText("Numero de Asistentes:");

        jLabel3.setText("Cliente:");

        jLabel4.setText("Contacto Cliente");

        btngTipoEvento.add(rbtDiurno);
        rbtDiurno.setText("Diurno");

        btngTipoEvento.add(rbtNocturno);
        rbtNocturno.setText("Nocturno");

        chkEquipoSonido.setText("Equipo de Sonido");

        jLabel7.setText("Tematica:");

        btngTematica.add(rbtFormal);
        rbtFormal.setText("Formal");

        btngTematica.add(rbtInformal);
        rbtInformal.setText("Informal");

        jLabel8.setText("Nombre");

        jLabel9.setText("Apellido");

        jLabel6.setText("Servicios:");

        chkMenajePremium.setText("Menaje Premium");

        chkAnimacion.setText("Animacion");

        chkCocteleria.setText("Cocteleria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(35, Short.MAX_VALUE).addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(chkCocteleria).addComponent(chkAnimacion).addComponent(chkMenajePremium).addGroup(jPanel2Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel6))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel6).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(chkMenajePremium).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(chkAnimacion).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(chkCocteleria)));

        jLabel5.setText("Tipo de Evento:");

        jLabel10.setText("Niños");

        jLabel11.setText("Adultos");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(26, 26, 26).addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel8).addGap(27, 27, 27)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel10).addGap(18, 18, 18))).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(txtNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel11)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jLabel9))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(txtAdultos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE).addComponent(txtApellido))).addComponent(jLabel2)).addGap(32, 32, 32).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel5).addComponent(jLabel7))).addComponent(jLabel3)).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(rbtNocturno).addComponent(rbtDiurno))).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(rbtInformal).addComponent(rbtFormal))))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addGap(18, 18, 18).addComponent(txtContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(chkEquipoSonido))).addGroup(jPanel1Layout.createSequentialGroup().addGap(485, 485, 485).addComponent(btnGuardar))).addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(jLabel5))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(txtAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel11))).addGap(2, 2, 2)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel10).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))).addComponent(jLabel3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel9).addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel7)).addGap(8, 8, 8).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtContactoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel4).addGap(21, 21, 21))).addGap(0, 0, Short.MAX_VALUE)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(rbtNocturno).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(rbtDiurno).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(rbtFormal)).addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(rbtInformal).addComponent(chkEquipoSonido)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE).addComponent(btnGuardar).addContainerGap()));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{

        }, new String[]{"Responsable", "Asistentes totales", "Cliente", "Contacto Cliente", "Tipo Evento", "Tematica", "Servicios", "Salon", "Precio Evento", "Serv.Comida NIÑOS", "Serv.Comida ADULTOS"}));
        jScrollPane2.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(layout.createSequentialGroup().addGap(168, 168, 168).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE))).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(14, 14, 14).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(25, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18).addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(42, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            String responsable = txtResponsable.getText();
            int ninos = Integer.parseInt(txtNiños.getText());
            int adultos = Integer.parseInt(txtAdultos.getText());
            String nombreCliente = txtNombre.getText().toUpperCase();
            String apellidoCliente = txtApellido.getText().toUpperCase();
            int contacto = Integer.parseInt(txtContactoCliente.getText());
            String tipoEvento;
            String tematicaEvento;

            ArrayList<String> servicioSeleccionados = new ArrayList<String>();

            if (rbtFormal.isSelected()) {
                tipoEvento="Formal";
            }else {
                tipoEvento="Informal";
            }

            if (rbtDiurno.isSelected()) {
                tematicaEvento = "Diurno";
            }else{
                tematicaEvento = "Nocturno";
            }

            eventoNuevo = new Evento(responsable, ninos, adultos, tematicaEvento, tipoEvento);

            if (chkAnimacion.isSelected()) {
                servicioSeleccionados.add(chkAnimacion.getText());
            }

            if (chkCocteleria.isSelected()) {
                servicioSeleccionados.add(chkCocteleria.getText());
            }

            if (chkEquipoSonido.isSelected()) {
                servicioSeleccionados.add(chkEquipoSonido.getText());
            }

            if (chkMenajePremium.isSelected()) {
                servicioSeleccionados.add(chkMenajePremium.getText());
            }

            if (eventoNuevo.getAsistentesTotales() < 15 || eventoNuevo.getAsistentesTotales() > 60) {
                throw new Exception("Numero incorrecto de asistentes");
            }

            txtResultado.append("\n" + eventoNuevo.toString());
            DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();

/*
            List<String> filtered = servicioSeleccionados.stream()
                    .map(servicioSeleccionados.indexOf()::get)
                    .collect(Collectors.toList());
*/
            Salon salon = new Salon(eventoNuevo);
            String[] fila = {responsable,
                    Integer.toString(eventoNuevo.getAsistentesTotales()),
                    apellidoCliente + " " + nombreCliente,
                    String.valueOf(contacto),
                    tipoEvento,
                    tematicaEvento,
                    servicioSeleccionados.toString(),
                    salon.getTipoSalon(),
                    "12.5"/*String.valueOf(eventoNuevo.getPrecio())*/,
                    String.valueOf(ninos * 12),
                    String.valueOf(adultos * 25)};
            modelo.addRow(fila);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Debe ingresar numeros " + "en el numero de asistentes y contacto; y letras en el" + " el nombre del cliente y responsable.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero de asistentes debe ser  " + "mayor a 15 y menor a 60." + "Intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup btngTematica;
    private javax.swing.ButtonGroup btngTipoEvento;
    private javax.swing.JCheckBox chkAnimacion;
    private javax.swing.JCheckBox chkCocteleria;
    private javax.swing.JCheckBox chkEquipoSonido;
    private javax.swing.JCheckBox chkMenajePremium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtDiurno;
    private javax.swing.JRadioButton rbtFormal;
    private javax.swing.JRadioButton rbtInformal;
    private javax.swing.JRadioButton rbtNocturno;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtAdultos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContactoCliente;
    private javax.swing.JTextField txtNiños;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
