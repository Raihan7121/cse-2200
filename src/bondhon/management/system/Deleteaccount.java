
package bondhon.management.system;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;


/**
 *
 * @author Acer
 */
public class Deleteaccount extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
   
    Vector <Integer> v =new Vector <>();
    public Deleteaccount() {
        
        initComponents();
        see();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        btn_back.setBackground(new java.awt.Color(51, 102, 0));
        btn_back.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLICK TO REMOVE  USER ACCOUNT  OR ");
        jLabel2.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_back)
                .addContainerGap(1187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back))
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 90));

        table.setBackground(new java.awt.Color(0, 51, 51));
        table.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                " No", "NAME", "AGE", "GENDER", "RELIGION", "DISTRICT", "MARITAL STATUS", "EDUCATIONAL STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1570, 690));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 1560, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void see(){
        int num=0;
        v.clear();
        
        v.add(0);
        String url = "jdbc:mysql://localhost:3306/bondhon";
        String dUser = "root";
        String dPass = "";

        try {
            Connection connection = DriverManager.getConnection(url, dUser, dPass);

            // Replace these with user-provided values
            

            // Create a prepared statement to check if the user's email and password match
            String sql = "SELECT * FROM bondhonuser";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            

            ResultSet resultSet = preparedStatement.executeQuery();
             
           // DefaultTableModel model = new DefaultTableModel();
           // JTable jTable = new JTable(model);

            // Add column names to the model
           // model.addColumn("ID");
            //model.addColumn("Username");
            //model.addColumn("Age");
            
            
             DefaultTableModel model =(DefaultTableModel)table.getModel();
            model.setRowCount(0);
            
           
            
            while(resultSet.next()) {
               
                
              int id = resultSet.getInt("id");
                String username = resultSet.getString("name");
                int age = Integer.parseInt(resultSet.getString("age"));
                String gender = resultSet.getString("gender");
                String religion = resultSet.getString("religion");
                String district = resultSet.getString("district");
                String marital = resultSet.getString("maritalstatus");
                String education = resultSet.getString("education");
                
                
                //String address = resultSet.getString("address");
                //model.addRow(new Object[]{id, username, age}); 
                  
              num++;
               v.add(id);
                  model.addRow(new Object []{num,username,age,gender,religion,district,marital,education});  
              
            } 
            //table=jTable;

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
           /* 
            JFrame frame = new JFrame("Data in JTable");
           // frame.add(new JScrollPane(jTable));
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            */
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(num==0){
            JOptionPane.showMessageDialog(new JFrame(), "NOT FOUND ANYONE.!!", "SEARCHED", JOptionPane.ERROR_MESSAGE); 
              
        }
        
}
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int in=Integer.parseInt(table.getValueAt(table.getSelectedRow(),0).toString());
        System.out.println(in);
        
        int nn=v.get(in);
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this account?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
           
        
        String url = "jdbc:mysql://localhost:3306/bondhon";
        String dUser = "root";
        String dPass = "";

        // SQL query to delete data where ID is 1
        String sql = "DELETE FROM bondhonuser WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(url, dUser, dPass);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Set the ID value to 1
            preparedStatement.setInt(1, nn);

            // Execute the delete query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data deleted successfully!");
                see();
            } else {
                JOptionPane.showMessageDialog(this, "No data found with ID 1");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting data: " + ex.getMessage());
        }
        } else {
            // User chose not to logout
            JOptionPane.showMessageDialog(this, "canceled.");
        }
          //new Searchviewprofile(nn).setVisible(true);
       /* String url = "jdbc:mysql://localhost:3306/bondhon";
        String dUser = "root";
        String dPass = "";
        
        try{
              Connection connection = DriverManager.getConnection(url, dUser, dPass);

            // Replace these with user-provided values
            

            // Create a prepared statement to check if the user's email and password match
            String sql = "SELECT * FROM bondhonuser";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            

            ResultSet resultSet = preparedStatement.executeQuery();
             
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        */
        
    }//GEN-LAST:event_tableMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
              setVisible(false); 
             Adminhome dashFrame= new Adminhome();
             dashFrame.setVisible(true);
             dashFrame.pack();
             dashFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(Deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new Deleteaccount().setVisible(true);
        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}