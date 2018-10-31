/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author benja
 */


import java.awt.event.*;
 import java.io.File;
import java.sql.*;
import java.util.*;
import javax.swing.*;
public class Menu extends javax.swing.JDialog {

    String url = "jdbc:mysql://localhost:3306/food";
    String username = "root";
    String password = "";
    Connection conn;
    Statement stm; 
    JTable Menu,snacks;
    int A,B;
    JScrollPane scrollPane;
    String foodName,foodPrice;
    String foodID="";


    /**
     * Creates new form Drinks
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        PopulateDrinksTable();
    }
public void PopulateDrinksTable(){
jPanel2.removeAll();
Vector columnNames = new Vector();
Vector data = new Vector();
//JPanel p=new JPanel();
try {
Class.forName("com.mysql.jdbc.Driver");
 conn = DriverManager.getConnection(url,username,password);
String sql = "SELECT ID,Name,Price from inventory WHERE Category='Foods' && Quantity>1";
stm = conn.createStatement();
ResultSet rs = stm.executeQuery( sql );
ResultSetMetaData md = rs.getMetaData();
int columns = md.getColumnCount();
for (int i = 1; i <= columns; i++) {
if(i==1){columnNames.addElement("ID" );}
else if(i==2){columnNames.addElement("Food Name" );}
else if(i==3){columnNames.addElement("Price" );}
else{
    columnNames.addElement(md.getColumnName(i));
}
}
while (rs.next()) {
Vector row = new Vector(columns);
for (int i = 1; i <= columns; i++){
row.addElement( rs.getObject(i) );

}
data.addElement( row );
}
rs.close();
stm.close();
}
catch(Exception e){
System.out.println(e);
}

 snacks = new JTable(data, columnNames);
tableColumn col;

for (int i = 0; i < snacks.getColumnCount(); i++) {
col = snacks.getColumnModel().getColumn(i);
col.setResizable(true);
}
snacks.addMouseListener(new MouseAdapter()   
    {  
            @Override
    public void mouseClicked(MouseEvent evt)  
    {  
   int row = snacks.getSelectedRow(); 
   foodID=String.valueOf(snacks.getModel().getValueAt(row, 0));
   foodName=String.valueOf(snacks.getModel().getValueAt(row, 1));
   foodPrice=String.valueOf(snacks.getModel().getValueAt(row, 2));
   
       }
    
  } ); 
scrollPane = new JScrollPane(snacks);
scrollPane.setSize(600, 879);
scrollPane.setWheelScrollingEnabled(true);

jPanel2.add( scrollPane );
  
//p.setSize(245,220);

}
private void MenuOrder()
{
try { 
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url,username,password);
         PreparedStatement statement = conn.prepareStatement
         ("INSERT INTO Orders (`OrderTable`, `FoodID`, `Name`, `Price`) VALUES(?,?,?,?)");
         statement.setString(1,OrderTable.getText());
         statement.setString(2,foodID);
         statement.setString(3,foodName);
         statement.setString(4,foodPrice);
                 
         statement.executeUpdate();
         statement.close();
            
         int k;
            k=JOptionPane.showConfirmDialog(jPanel2,"An order for "+foodName+" has been successfully placed! Do you wish to make another drink order?","Order Made",JOptionPane.YES_NO_OPTION);
        if(k==JOptionPane.YES_OPTION)
        {
          averageFood();              
         this.dispose();
         Menu dialog = new Menu(new javax.swing.JFrame(), true);
         dialog.setVisible(true);
        }
        else{
            averageFood();
            this.dispose();}    
conn.close();
        }
         catch (Exception exc) {  // process error
            System.out.println("process error" + exc);
                       JOptionPane.showMessageDialog(jPanel2,"Sorry, An Error Occurred!","Error!",JOptionPane.ERROR_MESSAGE);
                }
}
private void averageFood()
{
try { 
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url,username,password);
    try (PreparedStatement statement = conn.prepareStatement
                 ("UPDATE inventory SET Quantity=Quantity-1 WHERE ID="+foodID+"")) {
        statement.executeUpdate();
    }
           
conn.close();
        }
         catch (ClassNotFoundException | SQLException exc) {  // process error
            System.out.println("process error" + exc);
                       JOptionPane.showMessageDialog(jPanel2,"Sorry, An Error Occurred!","Error!",JOptionPane.ERROR_MESSAGE);
                }
}

   
    protected void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
this.dispose();        
    }
    protected void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        if("".equals(foodID))
        {
        JOptionPane.showMessageDialog(jPanel2,"Sorry, you have not chosen any food to order!","No Input!",JOptionPane.WARNING_MESSAGE);

        }
        else{
        int choice;
            choice=JOptionPane.showConfirmDialog(jPanel2,"An order for "+foodName+" will be  placed! Are you sure you want to place the order?","Order Confirmation",JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.YES_OPTION)
        {
          MenuOrder();              
                 }}
                // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            Menu dialog = new Menu(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OrderTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   





