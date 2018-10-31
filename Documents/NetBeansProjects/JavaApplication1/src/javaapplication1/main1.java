
package javaapplication1;

/**
 *
 * @author benja
 */
import javax.swing.*;

public class main1 {

   
        public static void main(String[] a) {
        
        JFrame myframe =new JFrame("LOGin");
         JPanel mypanel=new JPanel();
        JPanel panel=new JPanel();
        JLabel UsernameLabel=new JLabel("USERNAME");
        JTextField Username=new JTextField();
        Username.setColumns(20);
        JLabel PasswordLabel=new JLabel("PASSWORD");
        JTextField Password=new JTextField();
        Password.setColumns(20);
        JButton login=new JButton("LOGIN");
        JCheckBox check=new JCheckBox();
        JButton clear=new JButton("CLEAR");
        JCheckBox check2=new JCheckBox();
        mypanel.add(UsernameLabel);
        mypanel.add(Username);
        mypanel.add(PasswordLabel);
        mypanel.add(Password);
        mypanel.add(clear);
        mypanel.add(login);
        mypanel.add(panel);
        mypanel.add(mypanel);
        myframe.setSize(700,500);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true); 
    }
} 
