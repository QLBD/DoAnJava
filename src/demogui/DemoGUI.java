/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


/**
 *
 * @author THAITHANG
 */
public class DemoGUI{
    
    // Variables declaration
    private JFrame frame;
    private JButton btnExit;
    private JButton btnLogin;
    private JLabel lblUser;
    private JLabel lblPassword;
    private JLabel lblStatus;
    private JTextField tfPassword;
    private JTextField tfUser;
    // End of variables declaration 
    
    public DemoGUI(){
        initComponents();
    }
    
    private void initComponents() {
        
        frame = new JFrame("Demo Login");
        frame.setSize(428, 250);
        
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        tfUser = new JTextField();
        tfPassword = new JTextField();
        lblUser = new JLabel();
        lblPassword = new JLabel();
        btnLogin = new JButton();
        btnExit = new JButton();
        lblStatus = new JLabel();
        
        lblUser.setText("Tài Khoản:");

        lblPassword.setText("Mật khẩu:");

        btnLogin.setText("Đăng Nhập");

        btnExit.setText("Thoát");

        lblStatus.setText("Tình trạng kết nối:");
        
        //Set Size component
//        lblUser.setSize(62, 20);
//        lblPassword.setSize(57, 20);
//        
//        tfUser.setSize(253, 20);
//        tfPassword.setSize(253, 20);
        
        //Set Location component
//        lblUser.setLocation(28, 43);
//        lblPassword.setLocation(28, 79);
//        
//        tfUser.setLocation(100, 43);
//        tfPassword.setLocation(100, 79);

        lblUser.setBounds(28, 43, 62, 30);
        lblPassword.setBounds(28, 79, 57, 30);
        tfUser.setBounds(100, 43, 253, 30);
        tfPassword.setBounds(100, 79, 253, 30);
        btnLogin.setBounds(100, 130, 97, 30);
        btnExit.setBounds(256, 130, 97, 30);
        lblStatus.setBounds(28, 180, 130, 30);
        
        frame.add(lblUser);
        frame.add(lblPassword);
        frame.add(tfUser);
        frame.add(tfPassword);
        frame.add(btnLogin);
        frame.add(btnExit);
        frame.add(lblStatus);
        
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Đăng nhập thành công");
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Thoát");
            }
        });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new QuanLi().setVisible(true);
    }
}
