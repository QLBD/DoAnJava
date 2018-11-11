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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author RanRan
 */
public class DangNhap extends JFrame implements ActionListener{
    
    private JButton btnDangNhap;
    private JButton btnThoat;
    private JLabel lblMatKhau;
    private JLabel lblTaiKhoan;
    private JLabel lblTinhTrang;
    private JPasswordField pfMatKhau;
    private JTextField tfTaiKhoan;
    
    public DangNhap(){
        
        lblTaiKhoan = new javax.swing.JLabel();
        tfTaiKhoan = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblTinhTrang = new javax.swing.JLabel();
        pfMatKhau = new javax.swing.JPasswordField();

        setSize(370,260);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTaiKhoan.setText("Tài khoản");
        lblTaiKhoan.setBounds(30, 40,60,25);
        
        tfTaiKhoan.setBounds(110, 40, 180, 25);
        
        lblMatKhau.setText("Mật khẩu");
        lblMatKhau.setBounds(30,85,60,25);
        
        pfMatKhau.setBounds(110,85,180,25);
        
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBounds(30,135,100,25);
        btnDangNhap.addActionListener(this);
        
        btnThoat.setText("Thoát");
        btnThoat.setBounds(190, 135, 100, 25);
        btnThoat.addActionListener(this);
        
        lblTinhTrang.setText("Tình trạng kết nối:");
        lblTinhTrang.setBounds(30, 180,150,25);
        
        add(lblTaiKhoan);
        add(tfTaiKhoan);
        add(lblMatKhau);
        add(pfMatKhau);
        add(btnDangNhap);
        add(btnThoat);
        add(lblTinhTrang);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

            
    }
    
}
