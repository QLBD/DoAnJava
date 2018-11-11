/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogui;

import demogui.PanelQuanLi.pnKhachHang;
import demogui.PanelQuanLi.pnKhuyenMai;
import demogui.PanelQuanLi.pnNhanVien;
import demogui.PanelQuanLi.pnSanPham;
import demogui.PanelQuanLi.pnTaiKhoan;
import demogui.PanelQuanLi.pnThongKe;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author THAITHANG
 */
public class QuanLi extends JFrame{
    JTabbedPane tabPane;
    pnThongKe tabThongKe;
    pnNhanVien tabNhanVien;
    pnTaiKhoan tabTaiKhoan;
    pnKhachHang tabKhachHang;
    pnSanPham tabSanPham;
    pnKhuyenMai tabKhuyenMai;
    
    
    public QuanLi(){
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(974, 629);
        setLocationRelativeTo(null);
        
        tabPane = new JTabbedPane();
        
        tabThongKe = new pnThongKe();
        tabNhanVien = new pnNhanVien();
        tabTaiKhoan = new pnTaiKhoan();
        tabKhachHang = new pnKhachHang();
        tabSanPham = new pnSanPham();
        tabKhuyenMai = new pnKhuyenMai();
        
        tabPane.addTab("Thống Kê", tabThongKe);
        tabPane.addTab("Nhân Viên", tabNhanVien);
        tabPane.addTab("Tài Khoản", tabTaiKhoan);
        tabPane.addTab("Sản Phẩm", tabSanPham);
        tabPane.addTab("Khách hàng",tabKhachHang);
        tabPane.addTab("Khuyến mãi",tabKhuyenMai);
        
        add(tabPane);
    }
}
