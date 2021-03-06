/*
 Sección de ventas del programa
 */
package clases;

import Evs.TF_Event;
import static clases.Ventas.modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * Iván Zaid Corral Toca
 * Zayra Lucía Ortega Mejía
 * Sergio Jesús Quintero Mercado
 */
public class Ventasrec extends javax.swing.JFrame {

    /**
     * Creates new form Ventasrec
     */
    TF_Event evento=new TF_Event();
    float pago;
    int cantidad;
    float totalchido;
    float total;
    public Ventasrec() {
        initComponents();
         this.setLocationRelativeTo(null);
          mostrardatos("");
               modelo = new DefaultComboBoxModel();
   llena_combo();}
        void mostrardatos(String valor){
            DefaultTableModel modelo= new DefaultTableModel();    
    modelo.addColumn("ID DE VENTA");
    modelo.addColumn("OBJETO");
    modelo.addColumn("CANTIDAD");
    modelo.addColumn("TOTAL");
    modelo.addColumn("PAGO");
    modelo.addColumn("CAMBIO");
    tbproductos.setModel(modelo);
    String sql;
    if(valor.equals(""))
    {sql="SELECT * FROM ventas";}
    else{sql="SELECT * FROM ventas WHERE idVenta='"+valor+"'";}
 String []datos = new String [6];
        try { Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
            } tbproductos.setModel(modelo);
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error del tipo "+ex.getMessage());}}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtpago = new javax.swing.JTextField();
        jcb_venta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtcambio = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        jMenuItem2.setText("eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta");

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Producto"));

        jLabel2.setText("Cantidad");

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        jLabel3.setText("Total");

        txttotal.setEditable(false);

        btngrabar.setText("Guardar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        jLabel4.setText("Pago");

        txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoActionPerformed(evt);
            }
        });
        txtpago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpagoKeyTyped(evt);
            }
        });

        jcb_venta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Cambio");

        txtcambio.setEditable(false);

        jButton3.setText("Calcular Total");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Objeto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcambio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btngrabar))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Limpiar)
                        .addContainerGap(147, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngrabar)
                    .addComponent(btn_Limpiar)))
        );

        jButton2.setText("mostrar datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbproductos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tbproductos);

        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton4)
                .addGap(47, 494, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mostrardatos(txtbuscar.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
if(txtcantidad.getText().isEmpty()||txttotal.getText().isEmpty()||txtpago.getText().isEmpty()){
JOptionPane.showMessageDialog(null,"Termina de llenar los datos y calcula el total");
}else{ pago=Float.parseFloat(txtpago.getText());
  if(pago<totalchido){
JOptionPane.showMessageDialog(null,"No completas");
  }else{
       txtcambio.setText(String.format("%.2f", (pago-totalchido)));
    try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO ventas(idVenta,Objeto,Cantidad,Total,Pago,Cambio) VALUES (?,?,?,?,?,?)");
        pst.setString(1, null);
        pst.setString(2, String.valueOf(jcb_venta.getSelectedItem()));
        pst.setString(3, txtcantidad.getText());
        pst.setString(4, txttotal.getText());
        pst.setString(5, txtpago.getText());
         pst.setString(6, txtcambio.getText());
      pst.executeUpdate();
        mostrardatos("");
       txttotal.setText("");
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error del tipo "+e.getMessage());
    }
  }
    }
    }//GEN-LAST:event_btngrabarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrardatos("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Prin newFrame = new Prin();
        newFrame.setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String dato ="";
  int stock;
        cantidad=Integer.parseInt(txtcantidad.getText());
try {Statement st=cn.createStatement();
ResultSet rs = st.executeQuery("SELECT prepro FROM productos WHERE  nompro='"+String.valueOf(jcb_venta.getSelectedItem())+"'");
while (rs.next())
{dato = rs.getString(1); }
total=Float.parseFloat(dato);
ResultSet rss = st.executeQuery("SELECT Stock FROM productos WHERE  nompro='"+String.valueOf(jcb_venta.getSelectedItem())+"'");
while (rss.next()){dato = rss.getString(1); }
stock=Integer.parseInt(dato);
if(stock<cantidad){
    JOptionPane.showMessageDialog(null,"No tenemos Stock suficiente, solo nos quedan "+stock+" elementos");
}else{totalchido=total*cantidad;  
 txttotal.setText(String.format("%.2f", totalchido));
PreparedStatement pst = cn.prepareStatement("UPDATE productos SET Stock='"+(stock-cantidad)+"' WHERE nompro='"+String.valueOf(jcb_venta.getSelectedItem())+"'");
pst.executeUpdate();
}}catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Error del tipo "+ex.getMessage());}  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     int fila = tbproductos.getSelectedRow();
    String cod="";
    cod=tbproductos.getValueAt(fila, 0).toString();
    
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE FROM ventas WHERE  idVenta='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error del tipo "+e.getMessage());}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
evento.numberKeyPress(evt);       
int c =10;
    if(txtcantidad.getText().length()>=c){
        evt.consume();
    }// TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagoActionPerformed

    private void txtpagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpagoKeyTyped
evento.numberDecimalKeyPress(evt, txtpago); 
int c =10;
    if(txtpago.getText().length()>=c){
        evt.consume();
    }
    }//GEN-LAST:event_txtpagoKeyTyped

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
     limpiar(); 
    }//GEN-LAST:event_btn_LimpiarActionPerformed
void limpiar(){
     txtbuscar.setText("");
      txtcantidad.setText("");
      txtpago.setText("");
      txttotal.setText("");
      txtcambio.setText("");
}
    void llena_combo(){

try {
    modelo.removeAllElements(); 
    Statement st=cn.createStatement();
    ResultSet rs=st.executeQuery("Select * from productos");
    while(rs.next())
    {                
        modelo.addElement(rs.getString("nompro"));
    }
     jcb_venta.setModel(modelo);
} catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error del tipo "+ex.getMessage());
}}

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
            java.util.logging.Logger.getLogger(Ventasrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventasrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventasrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventasrec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventasrec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_venta;
    private javax.swing.JTable tbproductos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcambio;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtpago;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
 conectar cc= new conectar();
    Connection cn= cc.conexion();
}
