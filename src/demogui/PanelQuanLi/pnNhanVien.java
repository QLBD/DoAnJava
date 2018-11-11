/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogui.PanelQuanLi;

import java.awt.Button;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author THAITHANG
 */
public class pnNhanVien extends JPanel{
    
    private JPanel pnThongTin;
    
    private JLabel lblMaNV;
    private JLabel lblHoTen;
    private JLabel lblNgaySinh;
    private JLabel lblDiaChi;
    private JLabel lblLuongCB;
    private JLabel lblSoDT;
    
    private JTextField tfMaNV;
    private JTextField tflHoTen;
    private JTextField tfNgaySinh;
    private JTextField tfDiaChi;
    private JTextField tfLuongCB;
    private JTextField tfSoDT;
    
    private JButton btnXem;
    private JButton btnThem;
    private JButton btnSua;
    private JButton btnXoa;
    
    private JTable tableNhanVien;
    
    public pnNhanVien(){
        initComponents();
    }

    private void initComponents() {
        setLayout(null);
        
        pnThongTin = new JPanel();
        pnThongTin.setLayout(null);
        pnThongTin.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Thông tin nhân viên:"));
        pnThongTin.setBounds(20, 28, 725, 140);
        add(pnThongTin);
        
        lblMaNV = new JLabel("Mã NV:");
        lblMaNV.setBounds(20, 26, 42, 18);
        pnThongTin.add(lblMaNV);
        
        lblHoTen = new JLabel("Họ Tên:");
        lblHoTen.setBounds(20, 62, 46, 18);
        pnThongTin.add(lblHoTen);
        
        
        lblNgaySinh= new JLabel("Ngày Sinh:");
        lblNgaySinh.setBounds(20, 98, 62, 18);
        pnThongTin.add(lblNgaySinh);
        
        
        lblDiaChi = new JLabel("Địa Chỉ:");
        lblDiaChi.setBounds(356, 26, 44, 18);
        pnThongTin.add(lblDiaChi);
        
        
        lblLuongCB = new JLabel("Lương cơ bản");
        lblLuongCB.setBounds(356, 62, 82, 18);
        pnThongTin.add(lblLuongCB);
        
        
        lblSoDT = new JLabel("Số ĐT:");
        lblSoDT.setBounds(356, 98, 41, 18);
        pnThongTin.add(lblSoDT);
        
        
        tfMaNV = new JTextField();
        tfMaNV.setBounds(98, 24, 240, 24);
        pnThongTin.add(tfMaNV);
        
        
        tflHoTen = new JTextField();
        tflHoTen.setBounds(98, 60, 240, 24);
        pnThongTin.add(tflHoTen);
        
        tfNgaySinh = new JTextField();
        tfNgaySinh.setBounds(98, 96, 240, 24);
        pnThongTin.add(tfNgaySinh);
        
        tfDiaChi = new JTextField();
        tfDiaChi.setBounds(456, 24, 240, 24);
        pnThongTin.add(tfDiaChi);
        
        tfLuongCB = new JTextField();
        tfLuongCB.setBounds(456, 60, 240, 24);
        pnThongTin.add(tfLuongCB);
        
        tfSoDT = new JTextField();
        tfSoDT.setBounds(456, 96, 240, 24);
        pnThongTin.add(tfSoDT);
        
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

        tableNhanVien = new JTable(data, columnNames){
             @Override
            public boolean isCellEditable(int rows, int cols) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        tableNhanVien.setBounds(0, 0, 910, 250);
        
        //tạo thanh cuộn chứa table 
        JScrollPane scrollPane = new JScrollPane(tableNhanVien);
        scrollPane.setBounds(20, 231, 910, 250);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }
}
