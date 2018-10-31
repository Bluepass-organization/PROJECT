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
import java.awt.PopupMenu;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
public class ebcdc {
  public static void main(String[] args) {
        JFrame myframe;
        myframe=new JFrame("ADD NEW USER");
        JPanel mypanel=new JPanel();
        JLabel FirstNamelabel=new JLabel("First Name: ");
        JTextField FirstName=new JTextField();
        FirstName.setColumns(25);
        JLabel LastNamelabel=new JLabel("Last Name: ");
        JTextField LastName=new JTextField();
        LastName.setColumns(25);
        JLabel Telephonelabel=new JLabel("Telephone: ");
        JTextField Telephone=new JTextField();
        Telephone.setColumns(25);
        JLabel DateOfBirthlabel=new JLabel("Date of Birth: ");
        JTextField dateofbirth=new JTextField();
        dateofbirth.setColumns(25);
        JLabel ClearLabel=new JLabel("Clear:");
        JTextField Clear=new JTextField();
        Clear.setColumns(25);
        JLabel genderLabel=new JLabel("Gender:");
        JRadioButton gender=new JRadioButton();
        gender.setSelected(false);
        JRadioButton malebutton=new JRadioButton("MALE");
        JRadioButton male=new JRadioButton();
        JRadioButton femalebutton=new JRadioButton("FEMALE");
        JRadioButton female=new JRadioButton();
        JLabel NationalityLabel=new JLabel("Nationality");
        JTextField Nationality=new JTextField();
        Nationality.setColumns(25);
        JButton saveuser=new JButton("Save User");
        mypanel.add(FirstNamelabel);
        mypanel.add(FirstName);
        mypanel.add(LastNamelabel);
        mypanel.add(LastName);
        mypanel.add(DateOfBirthlabel);
        mypanel.add(dateofbirth);
        mypanel.add(Telephonelabel);
        mypanel.add(Telephone);
         mypanel.add(Clear);
        mypanel.add(ClearLabel);
        mypanel.add(genderLabel);
        mypanel.add(gender);
        mypanel.add(malebutton);
        mypanel.add(male);
        mypanel.add(femalebutton);
        mypanel.add(female);
        mypanel.add(NationalityLabel);
        mypanel.add(Nationality);
       myframe.add(mypanel);
        myframe.setSize(400,300);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        
        
        

        
    }
    
}   
    
