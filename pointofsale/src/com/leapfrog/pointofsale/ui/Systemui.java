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
import java.sql.ResultSet;
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
public class Systemui extends JFrame{
    
    private JLabel lblemail,lblpassword;
    private JButton btnlogin, btnregister;
    private JTextField txtemail,txtpassword;
    
    public Systemui(){
        setTitle("Login");
        setSize(354, 198);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        initcomponents();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    private void initcomponents(){
        
        lblemail = new JLabel("Email");
        txtemail = new JTextField(30);
        lblpassword = new JLabel("Password");
        txtpassword= new JTextField(30);
        btnlogin = new JButton("Login");
        btnlogin.addActionListener(new LoginButtonListener());
        btnregister = new JButton("Register");
        
        btnregister.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new register();
                setVisible(false);
            }
        });
        
        add(lblemail);
        add(txtemail);
        add(lblpassword);
        add(txtpassword);
        add(btnlogin);
        add(btnregister);
        
}
    private class LoginButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pointofsale", "root", null);
                String sql = "SELECT * FROM tbl_registration WHERE email=? and password=?";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, txtemail.getText());
                stmt.setString(2, txtpassword.getText());
                ResultSet rs = stmt.executeQuery();
                
                
                if (rs.next())
                {
                    JOptionPane.showMessageDialog(null, "Login Sucessfull");
                    new menu();
                    setVisible(false);
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Login not sucessfull");
                }
                
            }
            catch (ClassNotFoundException | SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
            
        }
        
    }
    
    
    
}
