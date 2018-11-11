/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogui.PanelQuanLi;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author THAITHANG
 */
public class pnTaiKhoan extends JPanel{

    private JPanel pnThongTin;
    
    private JLabel lblMaNV;
    private JLabel lblTenTK;
    private JLabel lblTenNV;
    private JLabel lblLoaiTK;
    
    private JComboBox cboMaNV;
    private JTextField tfMaNV;
    private JTextField tfTenTK;
    private JComboBox cboLoaiNV;
    
    private JButton btnXem;
    private JButton btnThem;
    private JButton btnSua;
    private JButton btnXoa;
    
    public pnTaiKhoan() {
        initComponents();
    }

    private void initComponents() {
        pnThongTin = new JPanel();
        pnThongTin.setLayout(null);
        pnThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Thông tin tài khoản:"));
        pnThongTin.setBounds(20, 28, 725, 100);
        add(pnThongTin);
        
//        lblMaNV = new JLabel("Mã NV:");
//        lblMaNV.setBounds(20, 26, 42, 18);
//        pnThongTin.add(lblMaNV);
//        
//        lblTenTK = new JLabel("Họ Tên:");
//        lblTenTK.setBounds(20, 62, 46, 18);
//        pnThongTin.add(lblTenTK);
//        
//        lblTenNV = new JLabel("Địa Chỉ:");
//        lblTenNV.setBounds(356, 26, 44, 18);
//        pnThongTin.add(lblTenNV);
//        
//        
//        lblLoaiTK = new JLabel("Lương cơ bản");
//        lblLoaiTK.setBounds(356, 62, 82, 18);
//        pnThongTin.add(lblLoaiTK);
//        
//        cboMaNV = new JComboBox();
//        cboMaNV.setBounds(98, 24, 240, 24);
//        pnThongTin.add(cboMaNV);
//        
//        
//        tfMaNV = new JTextField();
//        tfMaNV.setBounds(98, 60, 240, 24);
//        pnThongTin.add(tfMaNV);
//        
//        tfTenTK = new JTextField();
//        tfTenTK.setBounds(456, 24, 240, 24);
//        pnThongTin.add(tfTenTK);
//        
//        cboLoaiNV = new JComboBox();
//        cboLoaiNV.setBounds(456, 60, 240, 24);
//        pnThongTin.add(cboLoaiNV);
        
        btnXem = new JButton("Xem");
        btnXem.setBounds(420, 186, 61, 25);
        add(btnXem);
        
        btnThem = new JButton("Thêm");
        btnThem.setBounds(499, 186, 70, 25);
        add(btnThem);
        
        btnSua = new JButton("Sửa");
        btnSua.setBounds(587, 186, 60, 25);
        add(btnSua);
        
        btnXoa = new JButton("Xóa");
        btnXoa.setBounds(665, 186, 60, 25);
        add(btnXoa);
    }
    
    
}
