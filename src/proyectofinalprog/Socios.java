/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalprog;
import DataBaseLibrary.Metodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.FocusManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Nabor
 */
public class Socios extends javax.swing.JFrame {

    /**
     * Creates new form Socios
     */
    com.mysql.jdbc.Connection conn=null;
    static String sql="";  
    
   
    public Socios() {
                                            
        Metodos library = new Metodos();
        initComponents();
        jPanel1.setVisible(false);
        Conectar("jdbc:mysql://localhost", "zoo","user=root","password=Sobrada12345");
        
       
        
        
        
        
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        registrarButton = new javax.swing.JButton();
        usuarioField = new javax.swing.JTextField();
        connButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bajaButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        passField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrarButton.setText("¿No estás registrado? Pulsa aquí y registrate ahora!");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        usuarioField.setText("Usuario");

        connButton.setText("Conectarse");
        connButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connButtonActionPerformed(evt);
            }
        });

        bajaButton.setText("Darse de baja");
        bajaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bajaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bajaButton)
                .addGap(18, 18, 18)
                .addComponent(modificarButton)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        passField.setText("Contraseña");

        jButton3.setText("Desconectar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(connButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(registrarButton)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(connButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(registrarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        Suscribirse obxS = new Suscribirse();
        obxS.setVisible(true);
        Socios.this.setVisible(false);
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void bajaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaButtonActionPerformed
        
    }//GEN-LAST:event_bajaButtonActionPerformed

    private void connButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connButtonActionPerformed
        buscar("contraseña", "socios", "idsocio",usuarioField.getText());
        if(passField.getText().equals(sql)){
        jPanel1.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Contraseña Incorrecta!");
            sql="";
        }
    }//GEN-LAST:event_connButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel1.setVisible(false);
        sql="";
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajaButton;
    private javax.swing.JButton connButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField passField;
    private javax.swing.JButton registrarButton;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
 public void buscar(String parametro,String nomTabla,String ID,String valores) {
       
      
       try {
            Statement st= conn.createStatement();
               ResultSet rs= st.executeQuery("Select "+parametro+" from "+nomTabla+" where "+ID+"='"+valores+"'");
                    String [] datos= new String[6];
          while(rs.next()){
          
            for (int i = 0; i < datos.length; i++) {
                datos[i]=rs.getString(i+1);
                 sql= sql +""+datos[i];
                
            }
           
              }
                   
        } catch (SQLException ex) {
            System.out.println("Error en la visualizacion "+ex.getMessage());
        }
        
 }

        public Connection Conectar(String servidor,String base,String usuario,String contraseña){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn =(com.mysql.jdbc.Connection) DriverManager.getConnection(servidor+"/"+base+"?"+usuario+"&"+contraseña);
        }catch(Exception conectar){
            System.out.println(conectar.getMessage());
        }
        return conn; 
    }
}
            
        
    




