/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pointofsale.ui;

import com.mysql.jdbc.PreparedStatement;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author AT
 */
public class register extends JFrame {
    
    private JLabel lblfname, lbllname, lblemail, lblpassword, lblcpassword;
    private JButton btnregister, btnclear;
    private JTextField txtemail, txtpassword, txtfname, txtlname, txtcpassword;
    
    public register() {
        setTitle("Registration");
        setSize(367, 367);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        initcomponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private void initcomponents() {
        lblfname = new JLabel("First Name");
        txtfname = new JTextField(30);
        lbllname = new JLabel("Last Name");
        txtlname = new JTextField(30);
        lblemail = new JLabel("Email");
        txtemail = new JTextField(30);
        lblpassword = new JLabel("Password");
        txtpassword = new JTextField(30);
        lblcpassword = new JLabel("Confirm Password");
        txtcpassword = new JTextField(30);
        btnregister = new JButton("Register");
        btnregister.addActionListener(new SaveButtonListener());
        btnclear = new JButton("Clear");
        
        btnclear.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfname.setText("");
                txtlname.setText("");
                txtcpassword.setText("");
                txtemail.setText("");
                txtpassword.setText("");
            }
        });
        
        add(lblfname);
        add(txtfname);
        add(lbllname);
        add(txtlname);
        add(lblemail);
        add(txtemail);
        add(lblpassword);
        add(txtpassword);
        add(lblcpassword);
        add(txtcpassword);
        add(btnregister);
        add(btnclear);
        
    }
    
    private class SaveButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pointofsale", "root", null);
                String sql = "INSERT into tbl_registration(first_name,last_name,email,password)VALUES(?,?,?,?)";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, txtfname.getText());
                stmt.setString(2, txtlname.getText());
                stmt.setString(3, txtemail.getText());
                stmt.setString(4, txtpassword.getText());
                if (stmt.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "User Added sucessfully");
                }
                
            } catch (ClassNotFoundException | SQLException cnf) {
                
            }
            
        }
        
    }
}
