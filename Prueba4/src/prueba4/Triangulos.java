/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class Triangulos extends javax.swing.JFrame {

    ArrayList<Figura> listatriangulos = new ArrayList<Figura>();
    DefaultComboBoxModel listatriangulosModel = 
            new DefaultComboBoxModel(listatriangulos.toArray());

    public Triangulos() {
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTipodetriangulo = new javax.swing.JLabel();
        cmbTipodetriangulo = new javax.swing.JComboBox<>();
        lblLadoa = new javax.swing.JLabel();
        lblLadob = new javax.swing.JLabel();
        txtLadoa = new javax.swing.JTextField();
        txtLadob = new javax.swing.JTextField();
        lblAngulo = new javax.swing.JLabel();
        txtAngulo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTercerlado = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(800, 400));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo.setText("TRIÁNGULOS");

        lblTipodetriangulo.setText("Tipo de triángulo:");

        cmbTipodetriangulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectángulo", "Isósceles", "Escaleno", "Equilátero" }));
        cmbTipodetriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipodetrianguloActionPerformed(evt);
            }
        });

        lblLadoa.setText("Lado a:");

        lblLadob.setText("Lado b:");

        lblAngulo.setText("Ángulo formado entre los lados:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultados");

        jLabel2.setText("Área:");

        jLabel3.setText("Perímetro:");

        jLabel4.setText("Altura:");

        jLabel6.setText("Tercer lado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(lblAngulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAngulo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btnCalcular)
                            .addComponent(txtTercerlado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(lblLadoa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblTipodetriangulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblLadob)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbTipodetriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLadoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241)
                                .addComponent(lblPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtLadob, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(168, 168, 168)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                        .addComponent(txtPerimetro, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipodetriangulo)
                        .addComponent(cmbTipodetriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLadoa)
                            .addComponent(txtLadoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLadob)
                            .addComponent(txtLadob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTercerlado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAngulo))
                        .addGap(48, 48, 48)
                        .addComponent(btnCalcular)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPerimetro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipodetrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipodetrianguloActionPerformed
        
    }//GEN-LAST:event_cmbTipodetrianguloActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int opcion = cmbTipodetriangulo.getSelectedIndex();
        int a= Integer.parseInt(txtLadoa.getText());
        int b= Integer.parseInt(txtLadob.getText());
        
        
        switch(opcion){
            
            case 0:
                txtTercerlado.setEnabled(true);

                if(txtLadoa.getText()!=("") && txtLadoa.getText()!=("")){
                    
                    
                    int c= (int) Math.sqrt((Math.pow(a,2)+Math.pow(b, 2)));
                    
                    txtTercerlado.setText(Integer.toString(c));
                    
                    double area = (b*a)/2;
                    double perimetro = a+b+c;
                    double altura = (a*b)/c;
                    txtAngulo.setEnabled(true);
                    txtAngulo.setText("90");
                    txtArea.setText(Double.toString(area));
                    txtPerimetro.setText(Double.toString(perimetro));
                    txtAltura.setText(Double.toString(altura));
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Llene los campos requeridos");
                }
                
                
                break;
                
            case 1:
                
                
                
                txtTercerlado.setEnabled(true);

                if(txtLadoa.getText()!=("") && txtLadoa.getText()!=("")){
                    
                    int c= a;
                    txtTercerlado.setText(Integer.toString(c));                    
                    double area = b*(Math.sqrt((Math.pow(a,2))-((Math.pow(b, 2))/4)));
                    double perimetro = 2*a+b;
                    double altura = Math.sqrt((Math.pow(a,2))-((Math.pow(b, 2))/4));
                    txtAngulo.setEnabled(true);
                    txtAngulo.setText("30");
                    txtArea.setText(Double.toString(area));
                    txtPerimetro.setText(Double.toString(perimetro));
                    txtAltura.setText(Double.toString(altura));
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Llene los campos requeridos");
                }
                break;
            case 2:
                
                txtTercerlado.setEnabled(true);

                if(txtLadoa.getText()!=("") && txtLadoa.getText()!=("")&&txtTercerlado.getText()!=("")){
                    
                    
                    int c = Integer.parseInt(txtTercerlado.getText());
                    double s= (a+b+c)/2;
                    double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
                    double perimetro = a+b+c;
                    double altura = (2/a)*(Math.sqrt(s*((s-a)*(s-b)*(s-c))));
                    txtAngulo.setEnabled(false);
                    
                    txtArea.setText(Double.toString(area));
                    txtPerimetro.setText(Double.toString(perimetro));
                    txtAltura.setText(Double.toString(altura));
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Llene los campos requeridos");
                }
                
                break;
            case 3:
                
                txtTercerlado.setEnabled(false);
                txtLadob.setEnabled(false);

                if(txtLadoa.getText()!=("")){
                    
                    
                    b = a;
                    int c = a;
                    
                    double area = ((Math.sqrt(3)*a)/2)*Math.pow(a,2);
                    double perimetro = a*3;
                    double altura = ((Math.sqrt(3)*a)/2);
                    txtAngulo.setEnabled(false);
                    txtArea.setText(Double.toString(area));
                    txtPerimetro.setText(Double.toString(perimetro));
                    txtAltura.setText(Double.toString(altura));
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Llene los campos requeridos");
                }
                
                break;
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triangulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTipodetriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAngulo;
    private javax.swing.JLabel lblLadoa;
    private javax.swing.JLabel lblLadob;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblTipodetriangulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAngulo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtLadoa;
    private javax.swing.JTextField txtLadob;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtTercerlado;
    // End of variables declaration//GEN-END:variables
}
