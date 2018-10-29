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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
public abstract class LoginFrame extends JFrame implements ActionListener{
     Container container=getContentPane();
     JLabel userLabel=new JLabel("USERNAME");
     public JLabel passwordLabel=new JLabel("PASSWORD");
     JTextField userTextField=new JTextField();
     JTextField passwordField=new JTextField();
     JButton loginButton=new JButton("LOGIN ");
     JButton resetButton=new JButton("RESET");
     JButton logoutButton=new JButton("Logout");JCheckBox showPassword=new JCheckBox("Show Password");
    LoginFrame()//creatin constructor of LoginFrame()class
    {
    //Calling SetLayout()method inside the constructor
    setLayoutManager();
    setLocationAndSize();
    addComponentsToContainer();
    addActionEvent();
    }
    public void setLayoutManager(){
    
container.setLayout(null);  
    }
    public void setLocationAndSize(){
        userLabel.setBounds(50,150,100,30);
         getPasswordLabel().setBounds(50,220,100,30);
        userTextField.setBounds(150,150,150,30); 
        passwordField.setBounds(150,220,150,30);
        showPassword.setBounds(150,250,150,30);
        loginButton.setBounds(50,300,100,30);
        resetButton.setBounds(200,300,100,30);
        logoutButton.setBounds(200,300,100,30); 
    }
    public void addComponentsToContainer(){
    //ADDING EACH COMPONENTS TO THE CONTAINER
    container.add(userLabel);
    container.add(getPasswordLabel());
    container.add(userTextField);
    container.add(passwordField);
    container.add(showPassword);        
    container.add(loginButton);
    container.add(resetButton);
    container.add(logoutButton);
    }
    public void addActionEvent(){
    loginButton.addActionListener(this);
    resetButton.addActionListener(this);
    showPassword.addActionListener(this);
    logoutButton.addActionListener(this);
    }
    //Overriding actionPerfomed()method
    @Override
    public void actionPerformed(ActionEvent e)
    {//CODING PART OF LOGIN BUTTON
        if(e.getSource()==loginButton){
        String userText;
        String pwdText;
        userText=userTextField.getText();
        pwdText=passwordField.getText();
        if(userText.equalsIgnoreCase("Guest")&&pwdText.equalsIgnoreCase("default")){
         JOptionPane.showMessageDialog(this, "Login Succesful");
        }else{
        JOptionPane.showMessageDialog(this,"Invalid Username or Password");
                
        }
        }
        //CODING PART OF RESET BUTTON
        if(e.getSource()==resetButton){
        userTextField.setText("");
        passwordField.setText("");
        }
        //CODING PART OF SHOWPASSWORD JCHECKBOX
        if(e.getSource()==showPassword){
        if(showPassword.isSelected()){
        passwordField.setEchoChar((char)0);
        }else{
        passwordField.setEchoChar('*');
        }
        if(e.getSource()==loginButton){
        JOptionPane.showMessageDialog(this,"Are you sure you want to exit this page");
        }
        else{
        JOptionPane.showMessageDialog(this,"*");
        }
        }
    }   

    /**
     * @return the passwordLabel
     */
    public JLabel getPasswordLabel() {
        return passwordLabel;
    }
 }
class  Login extends main1{
    public static void main(String[]a){
    //Creating object of LoginFraame class and setting some of its properties
    LoginFrame frame=new LoginFrame() {};
    frame.setTitle("Login Form");
    frame.setVisible(true);
    frame.setBounds(150,150,400,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}