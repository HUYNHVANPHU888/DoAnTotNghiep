/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CTXH.DAO;

import CTXH.MODEL.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Thien
 */
public class AdminDAO {

    public Admin dangNhap(String username, String password) {
        Admin acc = null;
        try {
            Connection con = KetNoiCSDL.openConnection();
            String sql = "SELECT * FROM ADMIN WHERE TENTK = ? AND MATKHAU = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                acc = new Admin();
                acc.setTENTK(rs.getString("TENTK"));
                acc.setMATKHAU(rs.getString("MATKHAU"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return acc;
    }
}
