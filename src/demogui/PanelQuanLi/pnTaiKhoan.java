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
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
    private JTextField tfTenNV;
    private JTextField tfTenTK;
    private JComboBox cboLoaiNV;
    
    private JButton btnXem;
    private JButton btnThem;
    private JButton btnSua;
    private JButton btnXoa;
    private JButton btnResetMK;
    
    private JTable tableTaiKhoan;
    
    public pnTaiKhoan() {
        initComponents();
    }

    private void initComponents() {
        
        setLayout(null);
        
        pnThongTin = new JPanel();
        pnThongTin.setLayout(null);
        pnThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Thông tin tài khoản:"));
        pnThongTin.setBounds(20, 28, 725, 110);
        add(pnThongTin);
        
        lblMaNV = new JLabel("Mã NV:");
        lblMaNV.setBounds(20, 26, 42, 18);
        pnThongTin.add(lblMaNV);
        
        lblTenTK = new JLabel("Tên TK:");
        lblTenTK.setBounds(20, 62, 46, 18);
        pnThongTin.add(lblTenTK);
        
        lblTenNV = new JLabel("Tên NV:");
        lblTenNV.setBounds(356, 26, 44, 18);
        pnThongTin.add(lblTenNV);
        
        
        lblLoaiTK = new JLabel("Loại TK:");
        lblLoaiTK.setBounds(356, 62, 82, 18);
        pnThongTin.add(lblLoaiTK);
        
        cboMaNV = new JComboBox();
        cboMaNV.setBounds(98, 24, 240, 24);
        pnThongTin.add(cboMaNV);
        
        tfTenNV = new JTextField();
        tfTenNV.setBounds(98, 60, 240, 24);
        pnThongTin.add(tfTenNV);
        
        tfTenTK = new JTextField();
        tfTenTK.setBounds(456, 24, 240, 24);
        pnThongTin.add(tfTenTK);
        
        cboLoaiNV = new JComboBox();
        cboLoaiNV.setBounds(456, 60, 240, 24);
        pnThongTin.add(cboLoaiNV);
        
        btnXem = new JButton("Xem");
        btnXem.setBounds(420, 148, 61, 25);
        add(btnXem);
        
        btnThem = new JButton("Thêm");
        btnThem.setBounds(499, 148, 70, 25);
        add(btnThem);
        
        btnSua = new JButton("Sửa");
        btnSua.setBounds(587, 148, 60, 25);
        add(btnSua);
        
        btnXoa = new JButton("Xóa");
        btnXoa.setBounds(665, 148, 60, 25);
        add(btnXoa);
        
        btnResetMK = new JButton("Reset Mật Khẩu");
        btnResetMK.setBounds(763, 110, 123, 25);
        add(btnResetMK);
        
        String[] columnNames = {"Họ",
                                "Tên",
                                "Môn thể thao",
                                "Số năm chơi"};
        Object[][] data = {
	    {"Nguyễn", "Văn Nam",
	     "Bóng chuyền", new Integer(5)},
	    {"Lê ", "Văn Toàn",
	     "Bóng đá", new Integer(3)},
	    {"Trần", "Văn Tuấn",
	     "Bóng Bàn", new Integer(2)},
                    {"Trần", "Văn Tú",
	     "Cầu Lông", new Integer(2)},
                        {"Trần", "Hoàng",
	     "Bóng Bàn", new Integer(2)}
        };

        tableTaiKhoan = new JTable(data, columnNames){
             @Override
            public boolean isCellEditable(int rows, int cols) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        tableTaiKhoan.setBounds(0, 0, 910, 250);
        
        //tạo thanh cuộn chứa table 
        JScrollPane scrollPane = new JScrollPane(tableTaiKhoan);
        scrollPane.setBounds(20, 191, 910, 250);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }  
}
