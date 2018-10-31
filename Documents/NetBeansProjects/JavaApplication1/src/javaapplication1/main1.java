
package javaapplication1;

/**
 *
 * @author benja
 */
import javax.swing.*;
import java.awt.*;
import java.awt.*;

public class main1 {

        public static void main(String[] args) {
           
        JFrame myframe;
        myframe = new JFrame("Login");
        JPanel mypanel=new JPanel();
        JLabel usernamelabel=new JLabel("Username: ");
        JTextField username=new JTextField();
        username.setColumns(25);
        JLabel passwordlabel=new JLabel("Password: ");
        JTextField password=new JTextField();
        password.setColumns(25);
        JButton clear=new JButton("Clear");
        JButton login=new JButton("Login");
        mypanel.add(usernamelabel);
        mypanel.add(username);
        mypanel.add(passwordlabel);
        mypanel.add(password);
        mypanel.add(clear);
        mypanel.add(login);
        myframe.add(mypanel);
        myframe.setSize(400,400);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
        ;
} 
